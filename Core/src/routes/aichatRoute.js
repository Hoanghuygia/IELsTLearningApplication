import { Router } from "express";
import { ChatsController } from "../app/controllers/ChatsController.js";
import { AIController } from "../app/controllers/AIController.js";

const route = Router();
const chatsController = new ChatsController();
const chatGPTController = new AIController();

route.get('/:userId', chatsController.getChatsByUserId);
route.post('/addChat', chatsController.createChat);
route.post('/sendMessage', chatsController.sendMessage);
route.post('/chatGPT', chatGPTController.sendAIMessage);
route.get('/', chatsController.getAllChats);

export {route as aichatRoute}