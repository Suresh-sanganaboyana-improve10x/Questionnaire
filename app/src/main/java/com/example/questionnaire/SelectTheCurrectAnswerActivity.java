package com.example.questionnaire;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SelectTheCurrectAnswerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_the_currect_answer);

        Button verifySelectAnswerBtn = findViewById(R.id.verify_select_answers_btn);
        verifySelectAnswerBtn.setOnClickListener(view -> {
            RadioGroup solarSystemRg = findViewById(R.id.solar_system_rg);
            int selectedButtonId = solarSystemRg.getCheckedRadioButtonId();
            if (selectedButtonId == R.id.one_radio_btn) {
                Toast.makeText(this, "wrong answer", Toast.LENGTH_SHORT).show();
            } else if (selectedButtonId == R.id.second_radio_btn) {
                Toast.makeText(this, "right answer", Toast.LENGTH_SHORT).show();
            } else if (selectedButtonId == R.id.third_radio_btn) {
                Toast.makeText(this, "wrong answer", Toast.LENGTH_SHORT).show();
            } else if (selectedButtonId == R.id.fourth_radio_btn) {
                Toast.makeText(this, "wrong answer", Toast.LENGTH_SHORT).show();
            }
        });
    }
}