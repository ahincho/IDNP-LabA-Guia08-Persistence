package com.unsa.persistence.data.database.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.unsa.persistence.data.database.entities.UserEntity

@Dao
interface UserDao {
    @Query("SELECT * FROM users")
    fun getAllUsers(): List<UserEntity>
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUser(userEntity: UserEntity)
}