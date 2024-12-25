import mongoose from "mongoose";
import { Schema } from "mongoose";
import Content from "./Content.model.js";

const listeningSchema = new Schema(
    {
        label: {
            type: String,
            required: true,
        },
        type: String,
        content: {
            type: Schema.Types.ObjectId,
            ref: "Content",
        },
    },
    { collection: "listenings" }
);

const Listening = mongoose.model("Listening", listeningSchema);
export default Listening;
