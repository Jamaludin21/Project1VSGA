package com.example.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class KalkulatorActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    EditText Angka1 = findViewById(R.id.editTextNumberSigned2);
    EditText Angka2 = findViewById(R.id.editTextNumberSigned3);

    Button btn = findViewById(R.id.button);
    Button btn2 = (findViewById(R.id.button2));
    Button btn3 = findViewById(R.id.button3);
    Button btn4 = findViewById(R.id.button4);
    Button btn5 = findViewById(R.id.button5);

    TextView Hasil = findViewById(R.id.textView2);

        btn.setOnClickListener(view -> {
            if (Angka1.getText().toString().length()>0 && Angka2.getText().toString().length()>0){
                double angka1 = Double.parseDouble(Angka1.getText().toString());
                double angka2 = Double.parseDouble(Angka2.getText().toString());

                double hasil = angka1 - angka2;
                Hasil.setText("Hasil\n"+hasil);
            }
        });
        btn2.setOnClickListener(view -> {
            if (Angka1.getText().toString().length()>0 && Angka2.getText().toString().length()>0){
                double angka1 = Double.parseDouble(Angka1.getText().toString());
                double angka2 = Double.parseDouble(Angka2.getText().toString());

                double hasil = angka1 + angka2;
                Hasil.setText("Hasil\n"+hasil);
            }
        });
        btn3.setOnClickListener(view -> {
            if (Angka1.getText().toString().length()>0 && Angka2.getText().toString().length()>0){
                double angka1 = Double.parseDouble(Angka1.getText().toString());
                double angka2 = Double.parseDouble(Angka2.getText().toString());

                double hasil = angka1 * angka2;
                Hasil.setText("Hasil\n"+hasil);
            }
        });
        btn4.setOnClickListener(view -> {
            if (Angka1.getText().toString().length()>0 && Angka2.getText().toString().length()>0){
                double angka1 = Double.parseDouble(Angka1.getText().toString());
                double angka2 = Double.parseDouble(Angka2.getText().toString());

                double hasil = angka1 / angka2;
                Hasil.setText("Hasil\n"+hasil);
            }
        });
        btn5.setOnClickListener(view -> Hasil.setText(""));
    }

}