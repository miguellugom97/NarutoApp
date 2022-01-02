package com.miguellugo.narutoapp.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.miguellugo.narutoapp.domain.model.NinjaRemoteKey

@Dao
interface NinjaRemoteKeyDao {
    @Query("SELECT * FROM ninja_remote_key_table WHERE id=:id")
    suspend fun getRemoteKey(id: Int): NinjaRemoteKey?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addAllRemoteKeys(ninjaRemoteKeys: List<NinjaRemoteKey>)

    @Query("DELETE FROM ninja_remote_key_table")
    suspend fun deleteAllRemoteKeys()
}