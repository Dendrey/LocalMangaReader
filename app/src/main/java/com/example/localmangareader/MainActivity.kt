package com.example.localmangareader

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.localmangareader.ui.theme.LocalMangaReaderTheme
import androidx.compose.ui.res.stringResource
import com.example.localmangareader.ui.components.MangaLibraryTopAppBar



class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold(
                topBar = {
                    MangaLibraryTopAppBar(
                        onSearchClick = { /* открыть поиск */ },
                        onFilterClick = { /* открыть фильтры */ }
                    )
                },
                bottomBar = {
                    BottomAppBar ({Text("goodbye")})
                }
            ) {padding : PaddingValues ->
                MangaLibraryScreen(modifier = Modifier.padding(padding))}
        }
    }
}

@Composable
fun MangaLibraryScreen(modifier: Modifier) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        // Верхняя панель (заглушка под будущие элементы)
//        TopAppBar(
//            title = { Text("Моя библиотека") },
//            // сюда позже добавишь кнопки, поиск и т.п.
//        )

        // Прокручиваемое пространство для карточек
        LazyVerticalGrid(
            columns = GridCells.Adaptive(minSize = 120.dp),
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(100) { index ->
                MangaCard(title = "Манга $index")
            }
        }
    }
}

@Composable
fun MangaCard(title: String) {
    Card(
        modifier = Modifier
            .aspectRatio(2 / 3f)
            .fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Box(contentAlignment = Alignment.Center) {
            Text(title, textAlign = TextAlign.Center)
        }
    }
}