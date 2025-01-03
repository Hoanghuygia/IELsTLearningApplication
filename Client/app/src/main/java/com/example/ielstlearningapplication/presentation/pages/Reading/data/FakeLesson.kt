
import android.os.Parcelable
import androidx.annotation.DrawableRes
import com.example.ielstlearningapplication.R
import kotlinx.parcelize.Parcelize

@Parcelize
data class FakeLesson(
    val id: String,
    @DrawableRes val image: Int,
    var text: String
) : Parcelable





