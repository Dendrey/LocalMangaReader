package com.example.localmangareader.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text

// ui/screens/ReadingHistoryScreen.kt
@Composable
fun HistoryScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {
        Text("Здесь будет история чтения")
        // Позже: LazyColumn с мангой, отсортированной по дате последнего открытия
    }
}