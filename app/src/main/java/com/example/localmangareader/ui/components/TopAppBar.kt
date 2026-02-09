package com.example.localmangareader.ui.components

import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.ui.res.painterResource
import com.example.localmangareader.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MangaLibraryTopAppBar(
    onSearchClick: () -> Unit,
    onFilterClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    var expanded by remember { mutableStateOf(false) }

    TopAppBar(
        title = { Text(stringResource(R.string.app_name)) },
//        navigationIcon = null, // если не нужна кнопка "назад" или гамбургер
        actions = {
            IconButton(onClick = onSearchClick) {
                Icon(
                    painter = painterResource(R.drawable.search_24px),
                    contentDescription = stringResource(R.string.action_search)
                )
            }

            IconButton(onClick = onFilterClick) {
                Icon(
                    painter = painterResource(R.drawable.filter_list_24px),
                    contentDescription = stringResource(R.string.action_menu)
                )
            }

            IconButton(onClick = { expanded = true }) {
                Icon(
                    painter = painterResource(R.drawable.more_vert_24px),
                    contentDescription = stringResource(R.string.action_more)
                )
            }

            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {
                DropdownMenuItem(
                    text = { Text(stringResource(R.string.action_settings)) },
                    onClick = {
                        expanded = false
                        // обработчик настроек
                    }
                )
                DropdownMenuItem(
                    text = { Text(stringResource(R.string.action_help)) },
                    onClick = {
                        expanded = false
                        // обработчик справки
                    }
                )
            }
        },
//        windowInsets = WindowInsets.safeDrawing.only(WindowInsetsSides.Top) // корректный отступ под notch
    )
}