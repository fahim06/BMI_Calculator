package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText inputHeight, inputWeight;
    RadioGroup radioGroup;
    double height, weight, result;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputHeight = findViewById(R.id.heightID);
        inputWeight = findViewById(R.id.weightID);
        radioGroup = findViewById(R.id.radioGroupID);
        output = findViewById(R.id.outputID);
    }

    public void Calculation(View view) {
        height = Double.parseDouble(inputHeight.getText().toString());
        weight = Double.parseDouble(inputWeight.getText().toString());

        if (radioGroup.getCheckedRadioButtonId() == R.id.inputCmID) {
            height = height / 100;
            result = weight / (height * height);
        } else if(radioGroup.getCheckedRadioButtonId() == R.id.inputInchID){
            height = height / 39.37;
            result = weight / (height * height);
        }
        output.setText("BMI is: " + String.format("%.3f",result));
    }
}