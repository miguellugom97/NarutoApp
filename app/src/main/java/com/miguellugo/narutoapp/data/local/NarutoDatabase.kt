package com.miguellugo.narutoapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.miguellugo.narutoapp.data.local.dao.NinjaDao
import com.miguellugo.narutoapp.data.local.dao.NinjaRemoteKeyDao
import com.miguellugo.narutoapp.domain.model.Ninja
import com.miguellugo.narutoapp.domain.model.NinjaRemoteKey

@Database(entities = [Ninja::class, NinjaRemoteKey::class], version = 1)
@TypeConverters(DatabaseConverter::class)
abstract class NarutoDatabase: RoomDatabase() {
    abstract fun ninjaDao(): NinjaDao
    abstract fun ninjaRemoteKeyDao(): NinjaRemoteKeyDao
}