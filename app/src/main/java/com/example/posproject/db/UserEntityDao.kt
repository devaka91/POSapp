package com.example.posproject.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface UserEntityDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertUser(userEntity: UserEntity)

    @Update
    suspend fun updateUser(userEntity: UserEntity)

    @Delete
    suspend fun deleteUser(userEntity: UserEntity)

    @Query("SELECT * FROM user_details ")
    fun readUser():LiveData<List<UserEntity>>

}