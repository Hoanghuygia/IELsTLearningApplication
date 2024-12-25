import mongoose from "mongoose";
import { Schema } from "mongoose";

const contentSchema = new Schema({
    comments: [
        {
            comment_id: Number,
            user_id: { type: mongoose.Types.ObjectId, ref: "User" },
            content: {
                type: String,
                required: true,
            },
            like: {
                type: Number,
                default: 0,
            },
            timestamp: { type: Date, default: Date.now },
        },
    ],
    instructions: String,
    passages: [
        {
            passage_id: {
                type: Number,
                required: true,
            },
            title: String,
            questionGroup: [{
                question_id: {
                    type: String, 
                    required: true
                },
                question: String,
                option: [],
                answer: String
            }],
            text: String,
        },
    ],
});

const Content = mongoose.model("Content", contentSchema);
export default Content
