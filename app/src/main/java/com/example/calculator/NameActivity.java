package com.example.calculator;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NameActivity extends AppCompatActivity {
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        EditText Nama = findViewById(R.id.editTextTextPersonName2);
        Button btn_tampil = findViewById(R.id.button6);
        TextView Tampil = findViewById(R.id.textView4);

        btn_tampil.setOnClickListener(view -> {
            String Name = Nama.getText().toString();
            Tampil.setText("Nama Anda : "+Name);
        });
    }
}
