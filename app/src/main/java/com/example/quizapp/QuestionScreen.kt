package com.example.quizapp

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun QuestionScreen(onTimeout: () -> Unit, onNext: () -> Unit) {
    val scope = rememberCoroutineScope()
    var timeLeft by remember { mutableStateOf(10) }

    LaunchedEffect(key1 = Unit) {
        scope.launch {
            while (timeLeft > 0) {
                delay(1000L)
                timeLeft--
            }
            onTimeout()
        }
    }

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "What is the capital of France?", fontSize = 24.sp)
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = onNext) {
            Text(text = "Answer: Paris")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Time left: $timeLeft seconds")
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewQuestionScreen() {
    QuestionScreen(onTimeout = {}, onNext = {})
}
