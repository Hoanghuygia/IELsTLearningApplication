import {authRoute} from './authRoute.js'
import { readingRoute } from './readingRoute.js';
import { listeningRoute } from './listeningRoute.js';
import { speakingRoute } from './speakingRoute.js';
import { userRoute } from './userRoute.js';
import { aichatRoute } from './aichatRoute.js';

export function route(app){
    app.use('/aichat', aichatRoute);
    app.use('/reading', readingRoute);
    app.use('/listening', listeningRoute);
    app.use('/speaking', speakingRoute)
    app.use('/user', userRoute)
    app.use('/auth', authRoute);
}
