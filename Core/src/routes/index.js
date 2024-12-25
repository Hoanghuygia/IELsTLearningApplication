import {authRoute} from './authRoute.js'
import { readingRoute } from './readingRoute.js';

export function route(app){
    app.use('/reading', readingRoute);
    app.use('/auth', authRoute);
}
