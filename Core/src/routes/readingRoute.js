import { Router } from "express";
import { ReadingController } from "../app/controllers/ReadingController.js";

const router = Router()

const readingController = new ReadingController();

router.get('/', readingController.getAllReading);
router.get('/:readingId', readingController.getReadingById)

export {router as readingRoute}