package com.codelab.daniwebandroidroomforeignkey

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(tableName = "report_card",
    foreignKeys = [ForeignKey(
        entity = Student::class,
        childColumns = ["student_id"],
        parentColumns = ["id"]
)])
data class ReportCard(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "student_id") val studentId: Long
)