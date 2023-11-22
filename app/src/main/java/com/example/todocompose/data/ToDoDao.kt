package com.example.todocompose.data

import androidx.room.Dao
import androidx.room.Query
import com.example.todocompose.data.models.ToDoTask
import kotlinx.coroutines.flow.Flow

// データアクセスオブジェクト
@Dao
interface ToDoDao {

  @Query("SELECT * FROM todo_table ORDER BY id ASC")
  fun getAllTasks(): Flow<List<ToDoTask>>
}