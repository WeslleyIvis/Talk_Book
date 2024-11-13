package com.example.starteraplication.data.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class UserDbHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION)
    { companion object {
        const val DATABASE_NAME = "user_database.db"
        const val DATABASE_VERSION = 1
    }

        override fun onCreate(db: SQLiteDatabase) {
            val SQL_CREATE_ENTRIES =
                "CREATE TABLE $ {UserContract.UserEntry.TABLE_NAME} (" +
                        "${UserContract.UserEntry.COLUMN_ID} INTEGER PRIMARY KEY," +
                        "${UserContract.UserEntry.COLUMN_NAME} TEXT," +
                        "${UserContract.UserEntry.COLUMN_AGE} INTEGER," +
                        "${UserContract.UserEntry.COLUMN_EMAIL} TEXT," +
                        "${UserContract.UserEntry.COLUMN_PASSWORD} TEXT)"

            db.execSQL(SQL_CREATE_ENTRIES)
        }

        override fun onUpgrade(db: SQLiteDatabase, ondVersion: Int, newVersion: Int) {
            db.execSQL("DROP TABLE IF EXISTS ${UserContract.UserEntry.TABLE_NAME}")
            onCreate(db)
        }

        override fun onDowngrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
            onUpgrade(db, oldVersion, newVersion)
        }
    }