import express from 'express';
import morgan from 'morgan';
import createHttpError from 'http-errors';
import { config } from 'dotenv';
import { connectMongooseCloud } from './config/db/index.js';
import helmet from 'helmet';
import cors from 'cors'
import {route} from './routes/index.js'

const app = express();
app.use(morgan('dev'));
app.use(helmet());
app.use(express.json());
app.use(express.urlencoded({ extended: false }));
app.use(cors());
route(app)

config();

connectMongooseCloud();


app.use(async (req, res, next) => {
    next(createHttpError.NotFound('This route does not exist'));
});

app.use((err, req, res, next) => {
    res.status(err.status || 500);
    res.send({
        error: {
            status: err.status || 500,
            message: err.message,
        },
    });
});

const PORT = process.env.PORT || 5000;

app.listen(PORT, () => {
    console.log(`Server running on port ${PORT}`);
});
