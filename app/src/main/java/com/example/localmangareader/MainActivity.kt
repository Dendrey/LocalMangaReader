package com.example.localmangareader

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.localmangareader.ui.screens.MainScreen
import com.example.localmangareader.ui.theme.LocalMangaReaderTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LocalMangaReaderTheme {
                MainScreen()
            }
        }
    }
}



