package com.example.todocompose.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.todocompose.data.models.ToDoTask
import kotlinx.coroutines.flow.Flow

// データアクセスオブジェクト
@Dao
interface ToDoDao {

  @Query("SELECT * FROM todo_table ORDER BY id ASC")
  fun getAllTasks(): Flow<List<ToDoTask>>

  @Query("SELECT * FROM todo_table WHERE id=:taskId")
  fun getSelectedTask(taskId: Int): Flow<ToDoTask>

  @Insert(onConflict = OnConflictStrategy.IGNORE)
  suspend fun addTask(toDoTask: ToDoTask)
}