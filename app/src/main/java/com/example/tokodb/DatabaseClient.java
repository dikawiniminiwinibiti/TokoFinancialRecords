package com.example.tokodb;

import android.content.Context;

import androidx.room.Room;

public class DatabaseClient {

    private Context mCtx;
    private static com.example.tokodb.DatabaseClient mInstance;

    //our app database object
    private com.example.tokodb.AppDatabase appDatabase;

    private DatabaseClient(Context mCtx) {
        this.mCtx = mCtx;

        //creating the app database with Room database builder
        //MyToDos is the name of the database
        appDatabase = Room.databaseBuilder(mCtx, com.example.tokodb.AppDatabase.class, "MyToDos").build();
    }

    public static synchronized com.example.tokodb.DatabaseClient getInstance(Context mCtx) {
        if (mInstance == null) {
            mInstance = new com.example.tokodb.DatabaseClient(mCtx);
        }
        return mInstance;
    }

    public com.example.tokodb.AppDatabase getAppDatabase() {
        return appDatabase;
    }
}