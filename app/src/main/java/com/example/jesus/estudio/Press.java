package com.example.jesus.estudio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Press extends AppCompatActivity {

    long howManyClicks1=0L; //count button clicks
    long howManyClicks2=0L;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_press);
        HandleClick hc=new HandleClick();
        findViewById(R.id.imageButton).setOnClickListener(hc);
        findViewById(R.id.imageButton1).setOnClickListener(hc);
    }
    private class HandleClick implements View.OnClickListener {
        public void onClick(View arg0) {
            if(arg0.getId()==R.id.imageButton)
                ((TextView) findViewById(R.id.textView2)).setText("Pressed: " + ++howManyClicks1);
            else
                ((TextView) findViewById(R.id.textView3)).setText("Pressed: " + ++howManyClicks2);
        }
    }
}
