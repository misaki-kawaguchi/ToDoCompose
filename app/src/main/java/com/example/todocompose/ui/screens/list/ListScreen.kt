package com.example.todocompose.ui.screens.list

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ListScreen(
  navigateToTaskScreen: (Int) -> Unit,
) {

}

@Composable
@Preview
private fun ListScreenPreview() {
  ListScreen(navigateToTaskScreen = {})
}