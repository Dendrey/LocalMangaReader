package com.example.localmangareader.data.local.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable

// Manga.kt
@Serializable
data class MangaMeta(
    val title: String,
    val author: String = "",
    val tags: List<String> = emptyList(),
    val status: Int = 0,
    val description: String = ""
)

@Entity(tableName = "manga")
data class Manga(
    @PrimaryKey val id: Long = 0,
    val title: String,
    val author: String,
    val tagsJson: String, // JSON-строка
    val status: Int,
    val description: String,
    val folderPath: String,
    val coverFileName: String
)
