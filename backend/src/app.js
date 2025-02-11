import express from "express"
import dotenv from "dotenv"
import { connectDB } from "./config/db.js";

dotenv.config()

const app = express();

const PORT = process.env.PORT || 4000


app.listen(PORT, async () => {
    await connectDB()
    console.log(`server started in http://localhost:${4000}`);
})