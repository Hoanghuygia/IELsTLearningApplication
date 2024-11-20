import express from "express";
import morgan from "morgan"
import createHttpError from "http-errors";
import {config} from "dotenv"

const app = express()
config()


const PORT = process.env.PORT || 3000

app.listen(PORT, () => {
    console.log(`Server running on port ${PORT}`)
})