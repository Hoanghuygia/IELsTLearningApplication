import { Router } from "express";
import { ReadingController } from "../app/controllers/ReadingController.js";

const router = Router()

const readingController = new ReadingController();

router.get('/', readingController.getAllReading);

export {router as readingRoute}