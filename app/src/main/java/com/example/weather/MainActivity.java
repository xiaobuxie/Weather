package com.example.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.litepal.LitePal;
import org.litepal.tablemanager.Connector;
import org.litepal.util.Const;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LitePal.initialize(this);
        setContentView(R.layout.activity_main);


        Button createDatabases = (Button) findViewById(R.id.create_db);
        createDatabases.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"jjjjj",Toast.LENGTH_SHORT).show();
                SQLiteDatabase db = LitePal.getDatabase();
            }
        });
    }
}