package com.miguellugo.narutoapp.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.miguellugo.narutoapp.util.Constants.NINJA_REMOTE_KEY_DATABASE_TABLE

@Entity(tableName = NINJA_REMOTE_KEY_DATABASE_TABLE)
data class NinjaRemoteKey(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val prevPage: Int?,
    val nextPage: Int?
)
