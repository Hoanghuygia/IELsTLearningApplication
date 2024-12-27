import mongoose from "mongoose";
import { Schema } from "mongoose";

const messageSchema = new Schema({
    id: {
        type: String,
        required: true,
    },
    entity: {
        type: Number,
        enum: [0, 1],
    },
    content: String,
    timestamp: {
        type: Date,
        default: Date.now,
    },
});

const chatSchema = new Schema({
    id: {
        type: String,
        required: true,
    },
    label: String,
    messages: [messageSchema],
});

const chatsSchema = new Schema(
    {
        userId: {
            type: Schema.Types.ObjectId,
            ref: "User",
        },
        chats: [chatSchema],
    },
    {
        collection: "chats",
    }
);

const Chats = mongoose.model("Chats", chatsSchema);
export default Chats;
