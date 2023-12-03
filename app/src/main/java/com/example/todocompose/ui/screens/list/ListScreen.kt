package com.example.todocompose.ui.screens.list

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ListScreen(
  navigateToTaskScreen: (Int) -> Unit,
) {
  Scaffold(
    content = {},
    floatingActionButton = {
    }
  )
}

@Composable
@Preview
private fun ListScreenPreview() {
  ListScreen(navigateToTaskScreen = {})
}