package com.example.jesus.estudio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class ESpinner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        //an adapter is linked to array and a layout
        ArrayAdapter adapter = ArrayAdapter.createFromResource(
                this,
                R.array.coffeeType,
                android.R.layout.simple_spinner_item);
        //link the adapter to the spinner
        Spinner coffeeChoice = (Spinner) findViewById(R.id.chooseCoffee);
        coffeeChoice.setAdapter(adapter);
    }
}
