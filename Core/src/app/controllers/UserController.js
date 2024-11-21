// import mongoose from 'mongoose';
// import User from '../models/User.model';

// export class UserController {
//     addUser = async (req, res, next) => {

//     };
// }

import mongoose from 'mongoose';
import User from '../models/User.model.js';

export class UserController {
    addUser = async (req, res, next) => {
        try {
            const { email, password } = req.body;

            const existingUser = await User.findOne({ email });

            if (existingUser) {
                return res.status(400).json({ message: 'User with this email already exists' });
            }

            const newUser = new User({
                email,
                password,
            });

            await newUser.save();

            // Trả về phản hồi khi thêm thành công
            return res.status(201).json({
                message: 'User added successfully',
                user: {
                    email: newUser.email,
                },
            });
        } catch (error) {
            console.error(error);
            return res.status(500).json({ message: 'Server error', error: error.message });
        }
    };
}

