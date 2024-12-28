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
            
            const objectId = new mongoose.Types.ObjectId(userId);
            
            const userChats = await Chats.findOne({ userId: objectId })
                .populate({
                    path: 'userId',
                    model: 'User',
                    select: '-password'
                });
    
            if (!userChats) {
                return res.status(404).json({
                    success: false,
                    message: "No chats found for this user",
                });
            }
    
            return res.status(200).json({
                success: true,
                data: userChats,
            });
    
        } catch (error) {
            console.error("Error fetching chats by userId:", error);
            return res.status(500).json({
                success: false,
                message: "An error occurred while fetching chats.",
            });
        }
    };

    createChat = async (req, res, next) => {
        try {
            const { userId } = req.body;

            if (!userId) {
                return res.status(400).json({
                    success: false,
                    message: "UserId is required"
                });
            }

            const userObjectId = new mongoose.Types.ObjectId(userId);
    
            const newChat = {
                userId: userObjectId,
                chats: [
                    {
                        id: "chat" + Date.now(), // Tạo id unique
                        label: "New Chat",
                        messages: [
                            {
                                id: "msg1_" + Date.now(),
                                entity: 0,
                                content: "Hello! How can I help you today?",
                                timestamp: new Date()
                            }
                        ]
                    }
                ]
            };
    
            const chat = new Chats(newChat);
            await chat.save();
    
            return res.status(201).json({
                success: true,
                message: "Chat created successfully",
                data: chat
            });
    
        } catch (error) {
            console.error("Error creating chat:", error);
            return res.status(500).json({
                success: false,
                message: "An error occurred while creating chat.",
                error: error.message
            });
        }
    };
}
