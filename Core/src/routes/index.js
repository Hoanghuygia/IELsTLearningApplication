import {authRoute} from './authRoute.js'

export function route(app){
    app.use('/auth', authRoute);
}
