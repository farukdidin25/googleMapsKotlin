package com.farukdidin.maps.roomdb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.farukdidin.maps.model.Place

@Database(entities = [Place::class], version = 1)
abstract class PlaceDatabase : RoomDatabase() {
    abstract fun placeDao(): PlaceDao
}