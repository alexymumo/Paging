package com.alexmumo.paging.data.cache.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "game")
data class Game(
    @PrimaryKey
    val id: Int,
    val name: String,
    val release: String,
    val date: String
)
