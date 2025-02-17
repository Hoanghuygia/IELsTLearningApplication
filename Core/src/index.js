import express from 'express';
import morgan from 'morgan';
import { connectMongooseCloud } from './config/db/index.js';
import helmet from 'helmet';
import cors from 'cors'
import {route} from './routes/index.js'
import { handleError } from './helper/handleError.js';
import dotenv from 'dotenv';
dotenv.config();
// import { config } from 'dotenv';
// config()

console.log('OPENAI_API_KEY:', process.env.OPEN_AI_KEY ? 'Set' : 'Not set');

const app = express();

app.use(morgan('dev'));
app.use(helmet());
app.use(express.json());
app.use(express.urlencoded({ extended: false }));
app.use(cors());

// app.use("/", (req, res) => {
//     res.send("Welcome to the server!!!!")
// })

route(app)
handleError(app)

connectMongooseCloud();

const PORT = process.env.PORT || 5000;

app.listen(PORT, () => {
    console.log(`Server running on port ${PORT}`);
});
