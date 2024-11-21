import { Router } from 'express';
import { UserController } from '../app/controllers/UserController.js';

const router = Router();

const userController = new UserController();

router.post('/register', userController.addUser);

router.post('/login', async (req, res, next) => {
    res.send('Login');
});

router.post('/refresh-token', async (req, res, next) => {
    res.send('refresh-token');
});

router.delete('/logout', async (req, res, next) => {
    res.send('logout');
});

export { router as authRoute };
