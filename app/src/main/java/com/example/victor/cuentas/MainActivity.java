package com.example.victor.cuentas;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdminSqLite dbSQL = new AdminSqLite(this,"cuenta",null,1);
        SQLiteDatabase db = dbSQL.getWritableDatabase();
        Cursor fila = db.rawQuery("SELECT * FROM ordenes INNER JOIN usuarios ON ordenes.usuarios_id = usuarios.id INNER JOIN platillos ON ordenes.platillos_id = platillos.id",null);

    }

}
