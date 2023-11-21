package com.recepies.dbmodule

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [RecipeDbModel::class],
    version = 1,
    exportSchema = false
)
abstract class RecipeRoomDb :RoomDatabase(){
    abstract fun getRecipeDao():RecipeDao
}