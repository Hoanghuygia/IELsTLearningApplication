import mongoose from "mongoose";
import Speaking from "../models/Speaking.model.js";

export class SpeakingController {
    getAllSpeaking = async (req, res, next) => {
        try {
            const speakings = await Speaking.find({});

            if (speakings.length === 0) {
                return res.status(404).json({ message: "Speakings not found" });
            }

            return res.status(200).json({
                message: "Speaking found",
                speakings,
            });
            
        } catch (error) {
            console.error("Error in getAllSpeaking:", error); 
            return res.status(500).json({ message: "Server error" });
        }
    };
}
