package com.example.quizapp

import GifScreen
import android.content.SharedPreferences
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation(sharedPreferences: SharedPreferences) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(
                onStartClick = { navController.navigate("category") },
                onHistoryClick = { navController.navigate("history") }
            )
        }
        composable("category") {
            CategoryScreen(onCategorySelect = { navController.navigate("question") })
        }
        composable("question") {
            QuestionScreen(
                onTimeout = { navController.navigate("Gif") },
                onNext = { navController.navigate("Gif") }
            )
        }
        composable("history") {
            HistoryScreen(sharedPreferences = sharedPreferences)
        }
        composable("Gif"){
            GifScreen()
        }
    }
}
