package com.example.jesus.estudio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import static java.lang.Math.pow;

public class Mportrait extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mportrait);
    }

    public void HandleClick(View arg0) {
        double inputRate = 0.0;
        double convertedRate = 0.0;
        EditText inputText = (EditText)findViewById(R.id.editRate);
        TextView convertedText = (TextView)findViewById(R.id.textResult);
        try {
            inputRate = Double.parseDouble(inputText.getText().toString())/100.0;
        } catch (Exception ex) {
            inputText.setText("0.0");
        }

        if(((RadioButton)(findViewById(R.id.radioMonthly))).isChecked()) {
            //If converting to monthly
            convertedRate = (pow((1.0 + inputRate),(1.0/12.0)) - 1.0)*100.0;
        } else {
            //Converting to yearly
            convertedRate = (pow((1.0 + inputRate), 12) - 1.0) * 100.0;
        }
        convertedText.setText(String.format("Converted Rate is %1$.4f%%", convertedRate));
    }
}
