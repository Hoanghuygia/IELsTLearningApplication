import { Router } from "express";
import { ListeningController } from "../app/controllers/ListeningController.js";

const route = Router()

const listeningController = new ListeningController()

route.get("/", listeningController.getAllListening);

export {route as listeningRoute}