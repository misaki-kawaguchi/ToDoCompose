package com.example.todocompose.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.todocompose.util.Constants

fun NavGraphBuilder.listComposable(
  navigateToTaskScreen: (Int) -> Unit,
) {
  composable(
    route = Constants.LIST_SCREEN,
    arguments = listOf(navArgument(Constants.LIST_ARGUMENT_KEY) {
      type = NavType.StringType
    })
  ) {

  }
}