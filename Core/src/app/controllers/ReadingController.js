import mongoose from 'mongoose';
import Reading from '../models/Readings.model.js';

export class ReadingController {
    getAllReading = async (req, res, next) => {
        console.log("abc")
        try {
            const readings = await Reading.find().populate('content'); 

            if (readings.length === 0) {
                return res.status(404).json({ message: 'No readings found' });
            }

            return res.status(200).json({
                message: 'Readings retrieved successfully',
                readings,
            });
        } catch (error) {
            console.error(error);
            return res.status(500).json({ message: 'Server error', error: error.message });
        }
    };
}
