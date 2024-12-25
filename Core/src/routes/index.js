import {authRoute} from './authRoute.js'
import { readingRoute } from './readingRoute.js';
import { listeningRoute } from './listeningRoute.js';

export function route(app){
    app.use('/reading', readingRoute);
    app.use('/listening', listeningRoute);
    app.use('/auth', authRoute);
}
