package com.example.todocompose.ui.screens.list

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.todocompose.ui.theme.topAppBackgroundColor
import com.example.todocompose.ui.theme.topAppBarContentColor
import com.example.todocompose.R
import com.example.todocompose.components.PriorityItem
import com.example.todocompose.data.models.Priority

@Composable
fun ListAppBar() {
  DefaultListAppBar(
    onSearchClicked = {},
    onSortClicked = {}
  )
}

@Composable
fun DefaultListAppBar(
  onSearchClicked: () -> Unit,
  onSortClicked: (Priority) -> Unit,
) {
  TopAppBar(
    title = {
      Text(
        text = "Tasks",
        color = MaterialTheme.colors.topAppBarContentColor
      )
    },
    actions = {
      ListAppBarActions(
        onSearchClicked = onSearchClicked,
        onSortClicked = onSortClicked,
      )
    },
    backgroundColor = MaterialTheme.colors.topAppBackgroundColor
  )
}

@Composable
fun ListAppBarActions(
  onSearchClicked: () -> Unit,
  onSortClicked: (Priority) -> Unit,
) {
  SearchAction(onSearchClicked = onSearchClicked)
  SortAction(onSortClicked = onSortClicked)
}

@Composable
fun SearchAction(
  onSearchClicked: () -> Unit,
) {
  IconButton(onClick = { onSearchClicked() }) {
    Icon(
      imageVector = Icons.Filled.Search,
      contentDescription = stringResource(id = R.string.search_action),
      tint = MaterialTheme.colors.topAppBarContentColor
    )
  }
}

@Composable
fun SortAction(
  onSortClicked: (Priority) -> Unit,
) {
  var expanded by remember { mutableStateOf(false) }

  IconButton(
    onClick = { expanded = true }
  ) {
    Icon(
      painter = painterResource
        (
        id = R.drawable.ic_filter_list
      ),
      contentDescription = stringResource(id = R.string.sort_action),
    )
    DropdownMenu(
      expanded = expanded,
      onDismissRequest = { expanded = false }
    ) {
      DropdownMenuItem(
        onClick = {
          expanded = false
          onSortClicked(Priority.LOW)
        }
      ) {
        PriorityItem(priority = Priority.LOW)
      }
      DropdownMenuItem(
        onClick = {
          expanded = false
          onSortClicked(Priority.HIGH)
        }
      ) {
        PriorityItem(priority = Priority.HIGH)
      }
      DropdownMenuItem(
        onClick = {
          expanded = false
          onSortClicked(Priority.NONE)
        }
      ) {
        PriorityItem(priority = Priority.NONE)
      }
    }
  }
}

@Composable
@Preview
fun DefaultListAppBarPreview() {
  DefaultListAppBar(
    onSearchClicked = {},
    onSortClicked = {}
  )
}