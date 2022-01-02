package com.miguellugo.narutoapp.data.local.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.miguellugo.narutoapp.domain.model.Ninja
import com.miguellugo.narutoapp.util.Constants.NINJA_DATABASE_TABLE

@Dao
interface NinjaDao {

    @Query("SELECT * FROM $NINJA_DATABASE_TABLE ORDER BY id ASC")
    fun getAllNinjas(): PagingSource<Int, Ninja>

    @Query("SELECT *FROM $NINJA_DATABASE_TABLE WHERE id=:ninjaId")
    fun getSelectedNinja(ninjaId: Int) : Ninja

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addNinjas(ninjas: List<Ninja>)

    @Query("DELETE FROM $NINJA_DATABASE_TABLE")
    suspend fun deleteAllNinjas()
}