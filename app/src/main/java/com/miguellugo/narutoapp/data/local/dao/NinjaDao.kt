package com.miguellugo.narutoapp.data.local.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.miguellugo.narutoapp.domain.model.Ninja

@Dao
interface NinjaDao {

//    @Query("SELECT * FROM ninja_remote_key_table ORDER BY id ASC")
//    fun getAllNinjas(): PagingSource<Int, Ninja>
//
//    @Query("SELECT *FROM ninja_remote_key_table WHERE id=:ninjaId")
//    fun getSelectedNinja(ninjaId: Int) : Ninja
//
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    suspend fun addNinjas(ninjas: List<Ninja>)
//
//    @Query("DELETE FROM ninja_remote_key_table")
//    suspend fun deleteAllNinjas()
}