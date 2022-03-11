package com.codelab.daniwebandroidroomforeignkey

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Student::class, ReportCard::class], version = 1)
abstract class MyRoomDB : RoomDatabase() {
    abstract fun studentDao(): StudentDao
}
