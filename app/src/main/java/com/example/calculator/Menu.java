package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button btn_name = findViewById(R.id.btn_start_name);
        btn_name.setOnClickListener(view -> {
            Intent intent = new Intent(this,NameActivity.class);
            startActivity(intent);
        });
        Button btn_calculator = findViewById(R.id.btn_start_kalkulator);
        btn_calculator.setOnClickListener(view -> {
            Intent intent = new Intent(this,KalkulatorActivity.class);
            startActivity(intent);
        });
        Button btn_listview = findViewById(R.id.btn_start_listview);
        btn_listview.setOnClickListener(view -> {
            Intent intent = new Intent(this,ListViewActivity.class);
            startActivity(intent);
        });
    }
}