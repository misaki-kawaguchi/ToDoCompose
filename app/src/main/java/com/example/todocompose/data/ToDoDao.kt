package com.example.todocompose.data

import androidx.room.*
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

  @Update
  suspend fun updateTask(toDoTask: ToDoTask)
}