package com.example.localmangareader.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.localmangareader.ui.components.AppBottomBar
import com.example.localmangareader.ui.components.MangaLibraryTopAppBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    var currentScreen by remember { mutableStateOf<AppScreen>(AppScreen.Library) }

    Scaffold(
        topBar = {
            when (currentScreen) {
                AppScreen.Library -> MangaLibraryTopAppBar(
                    onSearchClick = { /* ... */ },
                    onFilterClick = { /* ... */ }
                )
                AppScreen.History -> TopAppBar(title = { Text("История") })
            }
        },
        bottomBar = {
            AppBottomBar(
                currentScreen = currentScreen,
                onScreenSelected = { currentScreen = it }
            )
        }
    ) { padding ->
        Box(modifier = Modifier.padding(padding).fillMaxSize()) {
            when (currentScreen) {
                AppScreen.Library -> LibraryScreen()
                AppScreen.History -> HistoryScreen()
            }
        }
    }
}
