import mongoose from "mongoose";
import { Schema } from "mongoose";

const questionSchema = new Schema({
    question: String,
    number: Number,
});

const speakingSchema = new Schema(
    {
        part: Number,
        title: String,
        content: [questionSchema],
    },
    {
        collection: "speaking",
    }
);

const Speaking = mongoose.model("Speaking", speakingSchema);
export default Speaking;
