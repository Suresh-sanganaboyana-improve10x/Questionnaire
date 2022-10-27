package com.example.questionnaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ComponentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_components);

        Button radioButtonsBtn = findViewById(R.id.radio_buttons_btn);
        radioButtonsBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, SelectTheCurrectAnswerActivity.class);
            startActivity(intent);
        });

        Button checkBoxesBtn = findViewById(R.id.check_boxes_btn);
        checkBoxesBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, SelectAllCurrectAnswersActivity.class);
            startActivity(intent);
        });

        Button otherComponentsBtn = findViewById(R.id.other_components_btn);
        otherComponentsBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, CalenderActivity.class);
            startActivity(intent);
        });
    }
}