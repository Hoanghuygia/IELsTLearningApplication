import mongoose from "mongoose";
import { Schema } from "mongoose";
import Content from "./Content.model.js";

const readingSchema = new Schema({
    label: {
        type: String,
        required: true,
    },
    type: {
        type: String,
        required: true,
    },
    content: {
        type: Schema.Types.ObjectId,
        ref: "Content",
    },
});

const Reading = mongoose.model("Reading", readingSchema);
export default Reading;
