package com.example.bmicalculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bmicalculator.model.BMIcalculatorModel;

public class MainActivity extends AppCompatActivity {


    EditText height, weight;
    Button calculate;
    TextView bmiResult, bmiStatus;
    BMIcalculatorModel compute;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        height = findViewById(R.id.heightEdit);
        weight = findViewById(R.id.weightEdit);
        bmiResult = findViewById(R.id.outputBMI);
        bmiStatus = findViewById(R.id.outputStatus);
        calculate = findViewById(R.id.calcu_btn);

        compute = new BMIcalculatorModel();


        calculate.setOnClickListener(view -> {

            compute.setFirstNumber(Double.parseDouble(height.getText().toString()));
            compute.setSecondNumber(Double.parseDouble(weight.getText().toString()));

            bmiResult.setText(String.valueOf(compute.bmi()));
            bmiStatus.setText(compute.status());

        });
    }
}