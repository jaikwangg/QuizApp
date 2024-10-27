package com.example.quizapp

import android.content.SharedPreferences
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HistoryScreen(sharedPreferences: SharedPreferences) {
    val history = sharedPreferences.getStringSet("history", emptySet()) ?: emptySet()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Quiz History", fontSize = 24.sp)
        Spacer(modifier = Modifier.height(16.dp))

        if (history.isEmpty()) {
            Text(text = "No history found")
        } else {
            history.forEach { entry ->
                Text(text = entry)
                Spacer(modifier = Modifier.height(8.dp))
            }
        }
    }
}
