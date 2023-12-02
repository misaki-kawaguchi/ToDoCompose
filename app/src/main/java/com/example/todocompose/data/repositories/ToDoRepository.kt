package com.example.todocompose.data.repositories

import com.example.todocompose.data.ToDoDao
import com.example.todocompose.data.models.ToDoTask
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ToDoRepository @Inject constructor(private val toDoDao: ToDoDao) {

  val getAllTasks: Flow<List<ToDoTask>> = toDoDao.getAllTasks()
  val sortByLowPriority: Flow<List<ToDoTask>> = toDoDao.sortByLowPriority()
  val sortByHighPriority: Flow<List<ToDoTask>> = toDoDao.sortByHighPriority()

  fun getSelectedTask(taskId: Int): Flow<ToDoTask> {
    return toDoDao.getSelectedTask(taskId = taskId)
  }
}