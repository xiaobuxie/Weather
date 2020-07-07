package com.example.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.bumptech.glide.ListPreloader;
import com.example.weather.gson.Weather;
import com.example.weather.util.Utility;

import org.litepal.LitePal;
import org.litepal.tablemanager.Connector;
import org.litepal.util.Const;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LitePal.initialize(this);
        setContentView(R.layout.activity_main);
        SQLiteDatabase db = LitePal.getDatabase();

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String weatherString = preferences.getString("weather",null);
        if(weatherString != null){
            Intent intent = new Intent(this,WeatherActivity.class);
            startActivity(intent);
            //finish();
        }
    }
}