package com.example.localmangareader.ui.screens

// ui/screens/Screen.kt
sealed interface AppScreen {
    data object Library : AppScreen
    data object History : AppScreen
    // позже: data object Downloads : AppScreen, и т.д.
}