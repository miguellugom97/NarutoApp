package com.miguellugo.narutoapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.miguellugo.narutoapp.data.local.dao.NinjaDao
import com.miguellugo.narutoapp.domain.model.Ninja

@Database(entities = [Ninja::class], version = 1)
abstract class NarutoDatabase: RoomDatabase() {
    abstract fun ninjaDao(): NinjaDao
}