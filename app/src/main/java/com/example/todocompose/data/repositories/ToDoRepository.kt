package com.example.todocompose.data.repositories

import com.example.todocompose.data.ToDoDao
import javax.inject.Inject

class ToDoRepository @Inject constructor(private val toDoDao: ToDoDao) {
}