package com.example.qyybaassh.r6tools;

import android.app.Application;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    public void perso(View view) {startActivity(new Intent(MainActivity.this, Perso.class));}
    public void map(View view){startActivity(new Intent(MainActivity.this, Map.class));}
    public void arme(View view){startActivity(new Intent(MainActivity.this, Arme.class));}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
