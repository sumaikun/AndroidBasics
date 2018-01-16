package com.example.jesus.estudio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.widget.EditText;
import android.text.TextWatcher;

public class TextWatcherE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_watcher);
        EditText percentage=(EditText) findViewById(R.id.editText);
        percentage.addTextChangedListener(new CheckPercentage());
    }

    class CheckPercentage implements TextWatcher {
        public void afterTextChanged(Editable s) {
            try {
                Log.d("Percentage", "input: " + s);
                if(Integer.parseInt(s.toString()) > 100)
                    s.replace(0, s.length(), "100");
            }
            catch(NumberFormatException nfe){}
        }
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            // Not used, details on text just before it changed
            // used to track in detail changes made to text, e.g. implement an undo
        }
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            // Not used, details on text at the point change made
        }
    }
}
