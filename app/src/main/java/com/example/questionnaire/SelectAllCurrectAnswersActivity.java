package com.example.questionnaire;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class SelectAllCurrectAnswersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_all_currect_answers);

        Button verifyAllCurrect = findViewById(R.id.verify_all_currect_btn);
        verifyAllCurrect.setOnClickListener(view -> {
            CheckBox mercuryCb = findViewById(R.id.mercury_cb);
            CheckBox sunCb = findViewById(R.id.sun_cb);
            CheckBox moonCb = findViewById(R.id.moon_cb);
            CheckBox jupiterCb = findViewById(R.id.jupiter_cb);
            CheckBox saturnCb = findViewById(R.id.saturn_cb);
            CheckBox plutoCb = findViewById(R.id.pluto_cb);
            if (mercuryCb.isChecked() && jupiterCb.isChecked() && saturnCb.isChecked() && sunCb.isChecked() == false && moonCb.isChecked() == false && plutoCb.isChecked() == false) {
                Toast.makeText(this, "correct", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "not correct", Toast.LENGTH_SHORT).show();
            }
        });
    }
}