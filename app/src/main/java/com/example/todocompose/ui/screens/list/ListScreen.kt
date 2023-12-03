package com.example.todocompose.ui.screens.list

import android.annotation.SuppressLint
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.todocompose.R

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ListScreen(
  navigateToTaskScreen: (Int) -> Unit,
) {
  Scaffold(
    topBar = {
      ListAppBar()
    },
    content = {},
    floatingActionButton = {
      ListFab(OnFabClicked = navigateToTaskScreen)
    }
  )
}

@Composable
fun ListFab(
  OnFabClicked: (Int) -> Unit,
) {
  FloatingActionButton(onClick = {
    OnFabClicked(-1)
  }) {
    Icon(
      imageVector = Icons.Filled.Add,
      contentDescription = stringResource(
        id = R.string.add_button
      ),
      tint = Color.White,
    )
  }
}

@Composable
@Preview
private fun ListScreenPreview() {
  ListScreen(navigateToTaskScreen = {})
}