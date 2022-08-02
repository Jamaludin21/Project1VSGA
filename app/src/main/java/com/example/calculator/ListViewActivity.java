package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        final String[] negara = getResources().getStringArray(R.array.list_negara);
        ListView lvNegara = findViewById(R.id.lv_negara);

        lvNegara.setOnItemClickListener((adapterView, view, i, l)
                -> Toast.makeText(ListViewActivity.this, "Terpilih :"+negara[i], Toast.LENGTH_SHORT).show());
    }
}