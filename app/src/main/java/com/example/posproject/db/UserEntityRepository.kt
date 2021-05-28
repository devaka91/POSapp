package com.example.posproject.db

class UserEntityRepository(private val dao: UserEntityDao) {
    val user = dao.readUser()

    suspend fun insert(userEntity: UserEntity){
        dao.insertUser(userEntity)

    }

    suspend fun update(userEntity: UserEntity){
        dao.updateUser(userEntity)

    }

    suspend fun delete(userEntity: UserEntity){
        dao.deleteUser(userEntity)

    }

}