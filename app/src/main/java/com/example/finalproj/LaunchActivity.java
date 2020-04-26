package com.example.finalproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class LaunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
        Button action = findViewById(R.id.FeverButton);
        Intent intent = new Intent(this, FeverMed.class);
        action.setOnClickListener(v -> {
            startActivity(intent);
            finish();
        });
        Button action2 = findViewById(R.id.CoughButton);
        Intent intent2 = new Intent(this, CoughMeds.class);
        action2.setOnClickListener(v -> {
            startActivity(intent2);
            finish();
        });

    }
}
