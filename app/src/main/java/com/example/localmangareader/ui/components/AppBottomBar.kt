package com.example.localmangareader.ui.components

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.localmangareader.R
import com.example.localmangareader.ui.screens.AppScreen

// ui/components/AppBottomBar.kt
@Composable
fun AppBottomBar(
    currentScreen: AppScreen,
    onScreenSelected: (AppScreen) -> Unit,
    modifier: Modifier = Modifier
) {
    NavigationBar(modifier = modifier) {
        val items = listOf(
            AppScreen.Library to R.string.library_title,
            AppScreen.History to R.string.history_title
        )

        items.forEach { (screen, label) ->
            NavigationBarItem(
                selected = currentScreen == screen,
                onClick = { onScreenSelected(screen) },
                icon = {
                    Icon(
                        painter = when (screen) {
                            AppScreen.Library -> painterResource(R.drawable.filter_list_24px)
                            AppScreen.History -> painterResource(R.drawable.more_vert_24px)
                        },
                        contentDescription = stringResource(label)
                    )
                },
                label = { Text(stringResource(label)) }
            )
        }
    }
}