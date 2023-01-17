package com.example.plainolnotes4.data

import androidx.room.TypeConverter
import java.util.Date

class DateConverter {
    @TypeConverter
    fun FromTimestamp(value: Long): Date{
        return Date(value)
    }

    @TypeConverter
    fun dateToTimesstamp(date: Date): Long{
        return date.time
    }
}