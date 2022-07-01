package com.alexmumo.cache.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.alexmumo.cache.entity.RemoteKey

@Dao
interface RemoteKeyDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveRemoteKey(remoteKey: List<RemoteKey>)

    @Query("SELECT * FROM remote_key_table WHERE label =: category")
    suspend fun fetchRemoteKey(category: String): RemoteKey
}