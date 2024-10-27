package com.example.quizapp

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import com.example.quizapp.ui.theme.QuizAppTheme

class MainActivity : ComponentActivity() {

    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize SharedPreferences
        sharedPreferences = getSharedPreferences("quiz_prefs", Context.MODE_PRIVATE)

        setContent {
            QuizAppTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    AppNavigation(sharedPreferences)
                }
            }
        }
    }
}
