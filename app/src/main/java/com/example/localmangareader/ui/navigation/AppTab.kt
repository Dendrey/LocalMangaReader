package com.example.localmangareader.ui.navigation

// ui/navigation/AppTabs.kt

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import com.example.localmangareader.R
import com.example.localmangareader.ui.screens.LibraryScreen

enum class AppTab(
    @StringRes val titleRes: Int,
    @DrawableRes val iconRes: Int,
    private val screenContent: @Composable (PaddingValues) -> Unit
) {
    LIBRARY(
        R.string.library_title,
        R.drawable.book_2_24px,
        { padding -> LibraryScreen(padding) }
    ),
    HISTORY(
        R.string.history_title,
        R.drawable.history_24px,
        { padding -> LibraryScreen(padding) }
    ),
    SETTINGS(
        R.string.settings_title,
        R.drawable.settings_24px,
        { padding -> LibraryScreen(padding) }
    );

    @Composable
    fun Content(padding: PaddingValues) = screenContent(padding)

    companion object {
        val entries: List<AppTab> = AppTab.entries
    }
}