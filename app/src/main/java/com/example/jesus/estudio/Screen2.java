package com.example.jesus.estudio;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

public class Screen2 extends AppCompatActivity {

    String goldWinner="Fred Bloggs";
    int goldScore=98123;
    String silverWinner="John Doe";
    int silverScore=54900;
    String bronzeWinner="Joe Public";
    int bronzeScore=25789;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_screen2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        findViewById(R.id.button).setOnClickListener(new handleButton());

        findViewById(R.id.btnModal).setOnClickListener(new PopupClick());
    }

    class handleButton implements View.OnClickListener {
        public void onClick(View view) {
            TextView tview = (TextView) findViewById(R.id.textView);
            tview.setText("changued");

        }
    }

    class PopupClick implements View.OnClickListener {
        public void onClick(View arg0) {
            Toast toast = Toast.makeText(Screen2.this, "Btn Modal", Toast.LENGTH_LONG);
            toast.show();
            showWinners();
        }
    }

    private void showWinners(){
        //We need to get the instance of the LayoutInflater, use the context of this activity
        LayoutInflater inflater = (LayoutInflater) Screen2.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //Inflate the view from a predefined XML layout (no need for root id, using entire layout)
        View layout = inflater.inflate(R.layout.winners,null);
        //load results
        ((TextView)layout.findViewById(R.id.goldName)).setText(goldWinner);
        ((TextView)layout.findViewById(R.id.goldScore)).setText(Integer.toString(goldScore));
        ((TextView)layout.findViewById(R.id.silverName)).setText(silverWinner);
        ((TextView)layout.findViewById(R.id.silverScore)).setText(Integer.toString(silverScore));
        ((TextView)layout.findViewById(R.id.bronzeName)).setText(bronzeWinner);
        ((TextView)layout.findViewById(R.id.bronzeScore)).setText(Integer.toString(bronzeScore));
        //Get the devices screen density to calculate correct pixel sizes
        float density=Screen2.this.getResources().getDisplayMetrics().density;
        // create a focusable PopupWindow with the given layout and correct size
        final PopupWindow pw = new PopupWindow(layout, (int)density*240, (int)density*285, true);
        //Button to close the pop-up
        ((Button) layout.findViewById(R.id.close)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                pw.dismiss();
            }
        });
        //Set up touch closing outside of pop-up
        pw.setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        pw.setTouchInterceptor(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_OUTSIDE) {
                    pw.dismiss();
                    return true;
                }
                return false;
            }
        });
        pw.setOutsideTouchable(true);
        // display the pop-up in the center
        pw.showAtLocation(layout, Gravity.CENTER, 0, 0);
    }

}
