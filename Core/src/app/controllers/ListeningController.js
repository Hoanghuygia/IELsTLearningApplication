import mongoose from "mongoose";
import Listening from "../models/Listening.model.js";

export class ListeningController {
    getAllListening = async (req, res, next) => {
        try {
            const listenings = await Listening.find().populate("content");

            if (listenings.length === 0) {
                return res
                    .status(404)
                    .json({ message: "No listeing found" });
            }

            return res.status(200).json({
                message: "Listening retrieved successfully!!!",
                listenings,
            });
        } catch (error) {
            console.log("Error: ", error);
            return res
                .status(500)
                .json({ message: "Server error", error: error.message });
        }
    };
}
