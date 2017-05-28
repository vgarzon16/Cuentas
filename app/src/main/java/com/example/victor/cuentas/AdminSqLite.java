package com.example.victor.cuentas;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Victor on 13/02/2017.
 */

public class AdminSqLite extends SQLiteOpenHelper {

    public AdminSqLite(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table usuarios(id int PRIMARY KEY AUTO_INCREMENT, nombre varchar(128))");
        db.execSQL("create table platillos(id int PRIMARY KEY AUTO_INCREMENT, nombre varchar(128))");
        db.execSQL("create table ordenes(id int PRIMARY KEY AUTO_INCREMENT, usuarios_id int NOT NULL, platillos_id int NOT NULL)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }
}
