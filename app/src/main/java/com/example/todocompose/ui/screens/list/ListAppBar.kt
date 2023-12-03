package com.example.todocompose.ui.screens.list

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.todocompose.ui.theme.topAppBackgroundColor
import com.example.todocompose.ui.theme.topAppBarContentColor

@Composable
fun ListAppBar() {
  DefaultListAppBar()
}

@Composable
fun DefaultListAppBar() {
  TopAppBar(
    title = {
      Text(
        text = "Tasks",
        color = MaterialTheme.colors.topAppBarContentColor
      )
    },
    backgroundColor = MaterialTheme.colors.topAppBackgroundColor
  )
}

@Composable
@Preview
fun DefaultListAppBarPreview() {
  DefaultListAppBar()
}