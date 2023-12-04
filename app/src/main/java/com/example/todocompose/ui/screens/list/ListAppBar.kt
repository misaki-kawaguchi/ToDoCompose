package com.example.todocompose.ui.screens.list

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.todocompose.ui.theme.topAppBackgroundColor
import com.example.todocompose.ui.theme.topAppBarContentColor

@Composable
fun ListAppBar() {
  DefaultListAppBar(
    onSearchClicked = {}
  )
}

@Composable
fun DefaultListAppBar(
  onSearchClicked: () -> Unit,
) {
  TopAppBar(
    title = {
      Text(
        text = "Tasks",
        color = MaterialTheme.colors.topAppBarContentColor
      )
    },
    actions = {
      ListAppBarActions(onSearchClicked = onSearchClicked)
    },
    backgroundColor = MaterialTheme.colors.topAppBackgroundColor
  )
}

@Composable
fun ListAppBarActions(
  onSearchClicked: () -> Unit,
) {
  SearchAction(onSearchClicked = onSearchClicked)
}

@Composable
fun SearchAction(
  onSearchClicked: () -> Unit,
) {
  IconButton(onClick = { onSearchClicked() }) {
    Icon(
      imageVector = Icons.Filled.Search,
      contentDescription = "Search tasks",
      tint = MaterialTheme.colors.topAppBarContentColor
    )
  }
}

@Composable
@Preview
fun DefaultListAppBarPreview() {
  DefaultListAppBar(
    onSearchClicked = {}
  )
}