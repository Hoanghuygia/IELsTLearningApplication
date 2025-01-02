
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

val ac_lessons = listOf(
    FakeLesson(id = "1", image = R.drawable.done, text = "Cambridge IELTS 16 Academic Reading - Test 1"),
    FakeLesson(id = "2", image = R.drawable.notdone, text = "Cambridge IELTS 16 Academic Reading - Test 2"),
    FakeLesson(id = "3", image = R.drawable.clock, text = "Cambridge IELTS 16 Academic Reading - Test 3"),
    FakeLesson(id = "4", image = R.drawable.notdone, text = "Cambridge IELTS 16 Academic Reading - Test 4"),
    FakeLesson(id = "5", image = R.drawable.done, text = "Cambridge IELTS 16 Academic Reading - Test 5"),
    FakeLesson(id = "6", image = R.drawable.notdone, text = "Cambridge IELTS 16 Academic Reading - Test 6"),
    FakeLesson(id = "7", image = R.drawable.clock, text = "Cambridge IELTS 16 Academic Reading - Test 7"),
    FakeLesson(id = "8", image = R.drawable.notdone, text = "Cambridge IELTS 16 Academic Reading - Test 8"),
    FakeLesson(id = "9", image = R.drawable.done, text = "Cambridge IELTS 16 Academic Reading - Test 9"),
    FakeLesson(id = "10", image = R.drawable.notdone, text = "Cambridge IELTS 16 Academic Reading - Test 10"),
    FakeLesson(id = "11", image = R.drawable.clock, text = "Cambridge IELTS 16 Academic Reading - Test 11"),
    FakeLesson(id = "12", image = R.drawable.notdone, text = "Cambridge IELTS 16 Academic Reading - Test 12")
)

val gt_lessons = listOf(
    FakeLesson(
        id = "1", image = R.drawable.done,
        text = "Cambridge IELTS 16 General Training Reading - Test 1"
    ),
    FakeLesson(
        id = "2", image = R.drawable.notdone,
        text = "Cambridge IELTS 16 General Training Reading - Test 2"
    ),
    FakeLesson(
        id = "3", image = R.drawable.clock,
        text = "Cambridge IELTS 16 General Training Reading - Test 3"
    ),
    FakeLesson(
        id = "4", image = R.drawable.notdone,
        text = "Cambridge IELTS 16 General Training Reading - Test 4"
    ),
)

