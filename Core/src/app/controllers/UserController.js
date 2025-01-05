// import mongoose from 'mongoose';
// import User from '../models/User.model';

// export class UserController {
//     addUser = async (req, res, next) => {

//     };
// }

import mongoose from "mongoose";
import History from "../models/History.model.js";
import User from "../models/User.model.js";

export class UserController {
    getAllUser = async (req, res, next) => {
        try {
            const users = await User.find()
                .populate("wordList.part_of_speech")
                .populate("historyWorking");
            return res.status(200).json({ success: true, data: users });
        } catch (error) {
            console.error("Error in getAllUser:", error);
            return res
                .status(500)
                .json({ message: "Server error", error: error.message });
        }
    };

    getUserIdByEmail = async (req, res, next) => {
        const { email } = req.params;
        try {
            const user = await User.findOne({ email }).select("_id");

            if (!user) {
                return res.status(404).json({ message: "User not found" });
            }

            return res.status(200).json({ user_id: user._id });
        } catch (error) {
            console.error("Error in getUserIdByEmail:", error);
            return res
                .status(500)
                .json({ message: "Server error", error: error.message });
        }
    };

    addUser = async (req, res, next) => {
        try {
            const { email, password, userName } = req.body;

            const existingUser = await User.findOne({ email });

            if (existingUser) {
                return res
                    .status(400)
                    .json({ message: "User with this email already exists" });
            }

            const newUser = new User({
                email,
                password,
                userName,
            });

            await newUser.save();

            return res.status(201).json({
                message: "User added successfully",
                success: true,
                user: {
                    user_id: newUser._id,
                    email: newUser.email,
                    userName: newUser.userName,
                },
            });
        } catch (error) {
            console.error(error);
            return res
                .status(500)
                .json({ message: "Server error", error: error.message });
        }
    };
}
