package com.example.periodtracker;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.Date;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "clockme.db";
    public static final String TABLE_NAME = "registeruser";

    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE registeruser (name TEXT, email TEXT,length integer, duration integer, datee TEXT)");




    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);

    }


    public void addUser(String name, String email, int length, int duration , String datee) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM registeruser", null);
        db = this.getWritableDatabase();
        ContentValues cV = new ContentValues();
        cV.put("name", name);
        cV.put("email", email);
        cV.put("length", length);
        cV.put("duration", duration);
        cV.put("datee", datee);
        db.insert("registeruser", null, cV);
        db.close();

    }

}
