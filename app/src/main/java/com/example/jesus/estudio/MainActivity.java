package com.example.jesus.estudio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MyAndroid", "onCreate");
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(new handleButton());
        findViewById(R.id.Btnarndemo).setOnClickListener(new demoButton());
        findViewById(R.id.Btnstate).setOnClickListener(new stateButton());
        findViewById(R.id.BtnBarcode).setOnClickListener(new barButton());
        findViewById(R.id.Btnlights).setOnClickListener(new lightButton());
    }

    class handleButton implements View.OnClickListener {
        public void onClick(View view) {
            Intent intent;
            intent = new Intent(MainActivity.this, Screen2.class);
            startActivity(intent);
        }
    }

    class demoButton implements View.OnClickListener{
        public void onClick(View view) {
            Intent intent;
            intent = new Intent(MainActivity.this, ANR_example.class);
            startActivity(intent);
        }
    }

    class stateButton implements View.OnClickListener{
        public void onClick(View view){
            Intent intent;
            intent = new Intent(MainActivity.this, StateExample.class);
            startActivity(intent);
        }
    }

    class barButton implements View.OnClickListener{
        public void onClick(View view){
            Intent intent;
            intent = new Intent(MainActivity.this, Scan_barcode.class);
            startActivity(intent);
        }
    }

    class lightButton implements View.OnClickListener{
        public void onClick(View view){
            Intent intent;
            intent = new Intent(MainActivity.this, Lights_animation.class);
            startActivity(intent);
        }
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("MyAndroid", "onStart");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d("MyAndroid", "onResume");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d("MyAndroid", "onPause");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d("MyAndroid", "onStop");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("MyAndroid", "onDestroy");
    }

    @Override
    public void onRestart() {
        super.onRestart();
        Log.d("MyAndroid","onRestart");
    }
}


























































































































































































































































































































































































































