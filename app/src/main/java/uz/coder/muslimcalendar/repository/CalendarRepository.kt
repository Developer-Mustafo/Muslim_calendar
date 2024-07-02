package uz.coder.muslimcalendar.repository

import kotlinx.coroutines.flow.Flow
import uz.coder.muslimcalendar.model.model.MuslimCalendar

interface CalendarRepository {
    suspend fun loading()
    suspend fun region(region:String)
    suspend fun remove()
    fun presentDay(): Flow<MuslimCalendar>
}