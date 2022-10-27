package com.example.questionnaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button componentsMainBtn = findViewById(R.id.components_main_btn);
        componentsMainBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, ComponentsActivity.class);
            startActivity(intent);
        });
    }
}