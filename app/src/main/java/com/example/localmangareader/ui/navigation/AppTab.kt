package com.example.localmangareader.ui.navigation

// ui/navigation/AppTabs.kt

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.localmangareader.R

enum class AppTab(
    @StringRes val titleRes: Int,
    @DrawableRes val iconRes: Int
) {
    LIBRARY(
        R.string.library_title,
        R.drawable.book_2_24px
    ),
    HISTORY(
        R.string.history_title,
        R.drawable.history_24px
    ),
    SETTINGS(
        R.string.settings_title,
        R.drawable.settings_24px
    );

    companion object {
        val entries: List<AppTab> = AppTab.entries
    }
}