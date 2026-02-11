package com.example.localmangareader.ui.screens

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import com.example.localmangareader.ui.components.TabBar
import com.example.localmangareader.ui.navigation.AppTab

@Composable
fun MainScreen() {
    var currentTab by rememberSaveable { mutableStateOf(AppTab.LIBRARY) }
    Scaffold(
        bottomBar = {
            TabBar(
                currentTab = currentTab,
                onTabSelected = { currentTab = it }
            )
        }
    ) { padding ->
        currentTab.Content(padding)
    }
}
