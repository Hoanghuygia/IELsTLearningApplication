import { Router } from "express";
import { UserController } from "../app/controllers/UserController.js";

const route = Router();
const userController = new UserController();

route.get("/", userController.getAllUser);
route.get("/:email", userController.getUserIdByEmail)

export {route as userRoute}