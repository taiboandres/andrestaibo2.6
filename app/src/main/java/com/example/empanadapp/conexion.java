package com.example.empanadapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class conexion extends SQLiteOpenHelper {

    final String crear_emp="CREATE TABLE empanada(nombre TEXT, precio INT, ing1 TEXT, ing2 TEXT, ing3 TEXT, ing4 TEXT, ing5 TEXT)";

    public conexion(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(crear_emp);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}
