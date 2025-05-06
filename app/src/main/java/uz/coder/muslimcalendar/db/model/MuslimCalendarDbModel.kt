package uz.coder.muslimcalendar.db.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("muslimCalendar")
data class MuslimCalendarDbModel(
    @PrimaryKey
    val day: Int = 0,
    val hijriDay: Int = 0,
    val hijriMonth: String = "",
    val month: Int = 0,
    val weekday: String = "",
    val asr: String = "",
    val hufton: String = "",
    val peshin: String = "",
    val shomIftor: String = "",
    val tongSaharlik: String = "",
    val sunset:String = "",
    val sunrise:String = ""
)