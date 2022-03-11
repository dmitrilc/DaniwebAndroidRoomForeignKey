package com.codelab.daniwebandroidroomforeignkey

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface StudentDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertStudent(student: Student): Long

    @Query("SELECT * FROM student WHERE id=:id")
    suspend fun getStudentById(id: Long): Student?

}