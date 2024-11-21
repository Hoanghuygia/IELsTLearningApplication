import mongoose from 'mongoose';
import { Schema } from 'mongoose';

const UserSchema = new Schema({
    email: {
        type: String,
        required: true,
        lowercase: true,
        unique: true,
    },
    password: {
        type: String,
        require: true,
    },
});

// const User = mongoose.model("User", UserSchema)
// module.exports = User
const User = mongoose.model('User', UserSchema);
export default User;
