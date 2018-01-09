package com.example.jesus.estudio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class StateExample extends AppCompatActivity {

    TextView next_number;
    long number_state=0L;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state_example);
        next_number = (TextView) findViewById(R.id.textView2);
    }

    public void HandleClick(View arg0) {
        //Load previous number from the state
        long previous_number = number_state;
        //Update the state (from the screen) prior to next calculation
        number_state = Long.parseLong(next_number.getText().toString());
        //Calculate next Fibonacci number and update screen
        next_number.setText(Long.toString(number_state + previous_number));
    }

    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putLong("PREVIOUS", number_state);
    }
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        number_state=savedInstanceState.getLong("PREVIOUS");
    }
}
