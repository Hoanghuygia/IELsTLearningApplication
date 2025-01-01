import { GoogleGenerativeAI } from "@google/generative-ai";
import dotenv from "dotenv";
dotenv.config();

export class AIController {
    constructor() {
        const apiKey = process.env.GEMINI_API_KEY;
        if (!apiKey) {
            throw new Error("GEMINI_API_KEY is not set in environment variables");
        }
        this.genAI = new GoogleGenerativeAI(apiKey);
        this.model = this.genAI.getGenerativeModel({ model: "gemini-pro" });
    }

    retryWithExponentialBackoff = async (fn, maxRetries = 5) => {
        let attempt = 0;
        while (attempt < maxRetries) {
            try {
                return await fn();
            } catch (error) {
                if (error.status === 429) {
                    console.error("Rate limit exceeded. Retrying...");
                    const delay = Math.pow(2, attempt) * 1000 + Math.random() * 1000;
                    await new Promise((resolve) => setTimeout(resolve, delay));
                    attempt++;
                } else {
                    throw error;
                }
            }
        }
        throw new Error("Exceeded maximum retries");
    };

    sendAIMessage = async (req, res, next) => {
        try {
            const { message } = req.body;
            console.log("Incoming message:", message);
    
            if (!message) {
                return res.status(400).json({
                    error: "Message is required",
                });
            }
    
            const response = await this.retryWithExponentialBackoff(async () => {
                const prompt = "As an AI assistant specialized in English and IELTS learning: " + message;
                
                const result = await this.model.generateContent(prompt);
                return result.response.text();
            });
    
            console.log("AI Response:", response);
    
            return res.status(200).json({
                message: response,
            });
        } catch (error) {
            console.error("Error communicating with Gemini API:", error);
            if (error.message && error.message.includes('SAFETY')) {
                return res.status(500).json({
                    error: "Your message was blocked due to safety concerns. Please ensure your request complies with the content guidelines.",
                });
            }
            return res.status(500).json({
                error: error.message || "Failed to get a response from AI",
            });
        }
    };
    
}