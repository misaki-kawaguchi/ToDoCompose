package com.example.todocompose.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.example.todocompose.data.repositories.ToDoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SharedViewModel @Inject constructor(
  private val repository: ToDoRepository
) : ViewModel() {

}