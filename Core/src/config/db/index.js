import mongoose from 'mongoose';

export async function connectMongooseCloud() {
    const uri = process.env.MONGOOSE_URL;

    try {
        mongoose.connection.on('connected', () => {
            console.log('Mongoose connected to DB');
        });

        mongoose.connection.on('disconnected', () => {
            console.log('Mongoose disconnected from DB');
        });

        mongoose.connection.on('error', (err) => {
            console.error('Mongoose connection error:', err);
        });

        await mongoose.connect(uri, {});

        console.log('Mongoose DB connected');
    } catch (error) {
        console.error('Failed to connect to MongoDB:', error);
    }
}
