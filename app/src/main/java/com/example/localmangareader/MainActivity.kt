package com.example.localmangareader

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import com.example.localmangareader.ui.components.MangaLibraryTopAppBar
import com.example.localmangareader.ui.screens.LibraryScreen
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



