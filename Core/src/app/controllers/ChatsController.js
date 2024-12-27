import mongoose from "mongoose";
import Chats from "../models/AIChat.model.js";

export class ChatsController {
    getAllChats = async (req, res, next) => {
        try {
            const chats = await Chats.find().populate("userId").exec();

            return res.status(200).json({
                success: true,
                data: chats,
            });
        } catch (error) {
            console.error("Error fetching chats:", error);
            return res.status(500).json({
                success: false,
                message: "An error occurred while fetching chats.",
            });
        }
    };

    getChatsByUserId = async (req, res, next) => {
        try {
            const { userId } = req.params;
            
            const chats = await Chats.findOne({ 
                userId: userId  // Không cần chuyển đổi ObjectId vì đã populate
            })
            .populate('userId')
            .select("chats")
            .exec();
    
            if (!chats) {
                return res.status(404).json({
                    success: false,
                    message: "Chats not found for the given user ID.",
                });
            }
    
            return res.status(200).json({
                success: true,
                data: chats.chats,
            });
        } catch (error) {
            console.error("Error fetching chats by userId:", error);
            return res.status(500).json({
                success: false, 
                message: "An error occurred while fetching chats.",
            });
        }
    };
}
