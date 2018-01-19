package com.example.jesus.estudio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;

public class Size extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_size);

        //object to store display information
        DisplayMetrics metrics = new DisplayMetrics();
//get display information
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
//show display width and height
        ((TextView)findViewById(R.id.textXY)).setText(
                Integer.toString(metrics.widthPixels)+","+Integer.toString(metrics.heightPixels));
    }

    public void onWindowFocusChanged(boolean hasFocus){
        super.onWindowFocusChanged(hasFocus);
        View v = (View) findViewById(R.id.imageView);
        String x = Integer.toString(v.getWidth());
        String y = Integer.toString(v.getHeight());
        //show ImageView width and height
        ((TextView)findViewById(R.id.textXY)).setText(x+","+y);
    }
}
