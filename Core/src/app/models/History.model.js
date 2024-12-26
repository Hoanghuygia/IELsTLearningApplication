import mongoose from "mongoose";
import { Schema } from "mongoose";

const readingResultSchema = new Schema({
    reading: {
        type: Schema.Types.ObjectId,
        ref: "Reading",
    },
    answers: [
        {
            question_id: Number,
            answer: String,
            status: Boolean, // Làm đúng hay làm sai
        },
    ],
    score: Number,
    correctNumber: Number,
    incorrectNumber: Number,
    totalTime: Number, // unit: minute
});

const listeningSchema = new Schema({
    listening: {
        type: Schema.Types.ObjectId,
        ref: "Listening",
    },
    answers: [
        {
            question_id: Number,
            answer: String,
            status: Boolean, // Làm đúng hay làm sai
        },
    ],
    score: Number,
    correctNumber: Number,
    incorrectNumber: Number,
    totalTime: Number, // unit: minute
});

const speakingSchema = new Schema({
    speaking: {
        type: Schema.Types.ObjectId,
        ref: "Speaking",
    },
    answers: [
        {
            question_id: Number,
            answerURL: String,
        },
    ],
    score: Number,
    totalTime: Number,
});

const historyWorkingSchema = new Schema(
    {
        reading: [readingResultSchema],
        listening: [listeningSchema],
        speaking: [speakingSchema],
    },
    {
        collection: "historyworking",
    }
);

const History = mongoose.model("History", historyWorkingSchema);
export default History;
