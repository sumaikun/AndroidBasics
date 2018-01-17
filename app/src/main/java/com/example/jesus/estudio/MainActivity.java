package com.example.jesus.estudio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

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
        findViewById(R.id.Btnsearch).setOnClickListener(new searchButton());
        findViewById(R.id.Btndice).setOnClickListener(new diceButton());
        findViewById(R.id.BtnList).setOnClickListener(new listButton());
        findViewById(R.id.BtnTwoLines).setOnClickListener(new twoButton());
        findViewById(R.id.BtnMultLines).setOnClickListener(new multButton());
        findViewById(R.id.BtnTextWatcher).setOnClickListener(new twatchButton());
        findViewById(R.id.BtnPortrait).setOnClickListener(new portraitButton());
        findViewById(R.id.BtnPress).setOnClickListener(new pressButton());
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

    class searchButton implements View.OnClickListener{
        public void onClick(View view){
            Intent intent;
            intent = new Intent(MainActivity.this, Search.class);
            startActivity(intent);
        }
    }

    class diceButton implements View.OnClickListener{
        public void onClick(View view){
            Intent intent;
            intent = new Intent(MainActivity.this, DiceDemo.class);
            startActivity(intent);
        }
    }

    class mailButton implements View.OnClickListener{
        public void onClick(View view){
            Intent intent;
            intent = new Intent(MainActivity.this, Correo.class);
            startActivity(intent);
        }
    }

    class listButton implements View.OnClickListener{
        public void onClick(View view){
            Intent intent;
            intent = new Intent(MainActivity.this, ListActivity.class);
            //startActivity(intent);
            startActivityForResult(intent, 0);
        }
    }

    class  twoButton implements View.OnClickListener{
        public void onClick(View view){
            Intent intent;
            intent = new Intent(MainActivity.this, TwoLines.class);
            //startActivity(intent);
            startActivityForResult(intent, 0);
        }
    }

    class  multButton implements View.OnClickListener{
        public void onClick(View view){
            Intent intent;
            intent = new Intent(MainActivity.this, MultLines.class);
            //startActivity(intent);
            startActivityForResult(intent, 0);
        }
    }

    class  twatchButton implements View.OnClickListener{
        public void onClick(View view){
            Intent intent;
            intent = new Intent(MainActivity.this, TextWatcherE.class);
            startActivity(intent);

        }
    }

    class  portraitButton implements View.OnClickListener{
        public void onClick(View view){
            Intent intent;
            intent = new Intent(MainActivity.this, Mportrait.class);
            startActivity(intent);

        }
    }

    class  pressButton implements View.OnClickListener{
        public void onClick(View view){
            Intent intent;
            intent = new Intent(MainActivity.this, Press.class);
            startActivity(intent);

        }
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(data != null && data.hasExtra("Order"))
            Toast.makeText(this, data.getStringExtra("Order") + " ordered.", Toast.LENGTH_LONG).show();
        else
            Toast.makeText(this, "Nothing ordered!", Toast.LENGTH_LONG).show();
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


























































































































































































































































































































































































































