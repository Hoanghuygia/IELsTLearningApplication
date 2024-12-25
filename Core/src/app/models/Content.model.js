import mongoose from "mongoose";
import { Schema } from "mongoose";

const questionSchema = new Schema({
  question_id: { 
    type: String, 
    required: true 
  },
  question: String,
  option: [String],
  answer: String
});

const questionGroupSchema = new Schema({
  instruction: String,
  questions: [questionSchema]
});

const passageSchema = new Schema({
  passage_id: {
    type: Number,
    required: true
  },
  title: String,
  paragraph: String,
  questionGroup: [questionGroupSchema],
  audioURL: String,
  type: String
});

const commentSchema = new Schema({
  comment_id: Number,
  user_id: {
    type: mongoose.Types.ObjectId,
    ref: "User"
  },
  content: {
    type: String,
    required: true
  },
  like: {
    type: Number,
    default: 0
  },
  timestamp: {
    type: Date,
    default: Date.now
  }
});

const contentSchema = new Schema({
  comments: [commentSchema],
  instructions: String,
  passages: [passageSchema]
}, {
  collection: "contents"
});

const Content = mongoose.model("Content", contentSchema);
export default Content;