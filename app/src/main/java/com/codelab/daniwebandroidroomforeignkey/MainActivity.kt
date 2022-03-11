package com.codelab.daniwebandroidroomforeignkey

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import androidx.room.Room
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db = Room.databaseBuilder(
            applicationContext,
            MyRoomDB::class.java, "my-room-db"
        ).build()

        lifecycleScope.launch {
            db.studentDao().getStudentById(1)
        }

    }
}