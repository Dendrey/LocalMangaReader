package com.example.localmangareader.ui.components

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.localmangareader.ui.navigation.AppTab

// ui/components/TabBar.kt
@Composable
fun TabBar(
    currentTab: AppTab,
    onTabSelected: (AppTab) -> Unit,
    modifier: Modifier = Modifier
) {
    NavigationBar(modifier = modifier) {
        AppTab.entries.forEach { tab ->
            NavigationBarItem(
                selected = currentTab == tab,
                onClick = { onTabSelected(tab) },
                icon = {Icon(painter = painterResource(tab.iconRes), null)}, // navigation bar item already has label which works as description
                label = { Text(stringResource(tab.titleRes)) }
            )
        }
    }
}