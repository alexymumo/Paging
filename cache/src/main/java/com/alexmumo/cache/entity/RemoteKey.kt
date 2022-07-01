package com.alexmumo.cache.entity

import androidx.room.Entity

@Entity(tableName = "remote_key_table")
data class RemoteKey(
    val nextKey: String?
)
