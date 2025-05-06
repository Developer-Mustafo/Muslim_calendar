package uz.coder.muslimcalendar.ktor

import io.ktor.client.HttpClient
import io.ktor.client.engine.android.Android
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import uz.coder.muslimcalendar.ktor.internet.quran.QuranDTO
import uz.coder.muslimcalendar.ktor.internet.quran.ResultDTO
import uz.coder.muslimcalendar.ktor.internet.quran.SurahDTO

interface ApiService {
    suspend fun getQuranArab(): ResultDTO<QuranDTO>
    suspend fun getSura(surahNumber: Int): SurahDTO
    companion object{
        const val BASE_URL_SURAH_LIST = "https://api.alquran.cloud/v1"
        const val QURAN_ARAB = "/quran/quran-uthmani"
        //surah
        const val BASE_URL_OF_PERFECT_TRANSLATION = "https://quranenc.com/"
        const val UZB_TRANSLATION = "api/v1/translation/sura/uzbek_mansour"
        const val ENG_TRANSLATION = "api/v1/translation/sura/english_saheeh"
        const val RUS_TRANSLATION = "api/v1/translation/sura/russian_kuliev"
        val apiService: ApiService = ApiServiceImpl(HttpClient(Android) {
            install(ContentNegotiation) {
                json(Json { ignoreUnknownKeys = true })
            }
        })
    }
}