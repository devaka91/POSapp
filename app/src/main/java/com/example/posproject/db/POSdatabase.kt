package com.example.posproject.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [UserEntity::class],version = 1)
abstract class POSdatabase : RoomDatabase (){
    abstract val userEntityDao  : UserEntityDao

    companion object{

        @Volatile
        private var INSTANCE : POSdatabase? = null
        fun getInstance(context: Context):POSdatabase{
            synchronized(this){
                var instance:POSdatabase? = INSTANCE
                if(instance==null){
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        POSdatabase::class.java,
                        "pos_database"

                    ).build()


                }
                return instance


            }


        }


    }

}