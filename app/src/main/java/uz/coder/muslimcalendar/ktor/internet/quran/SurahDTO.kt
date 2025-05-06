package uz.coder.muslimcalendar.ktor.internet.quran

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class SurahDTO(
    @SerialName("result")
    val result: List<SurahListDTO>?=null,
)
