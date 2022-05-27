package com.alexmumo.paging.data.cache.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.alexmumo.paging.data.cache.entity.RemoteKey

@Dao
interface RemoteDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveKey(remoteKey: RemoteKey)
}
