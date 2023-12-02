package com.example.todocompose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.todocompose.util.Constants.LIST_SCREEN

@Composable
fun SetupNavigation(
  navController: NavHostController
) {

  val screen = remember(navController) {
    Screens(navController = navController)
  }
}