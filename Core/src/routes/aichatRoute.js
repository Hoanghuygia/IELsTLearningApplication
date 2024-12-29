import { Router } from "express";
import { ChatsController } from "../app/controllers/ChatsController.js";

const route = Router();
const chatsController = new ChatsController();

route.get('/:userId', chatsController.getChatsByUserId);
route.post('/addChat', chatsController.createChat);
route.get('/', chatsController.getAllChats);

export {route as aichatRoute}