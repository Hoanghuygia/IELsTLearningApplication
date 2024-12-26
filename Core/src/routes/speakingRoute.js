import { Router } from "express";
import { SpeakingController } from "../app/controllers/SpekingController.js";

const route = Router()

const speakingController = new SpeakingController();

route.get("/", speakingController.getAllSpeaking);

export {route as speakingRoute}