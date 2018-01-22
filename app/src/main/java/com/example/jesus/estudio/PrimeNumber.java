package com.example.jesus.estudio;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class PrimeNumber extends AppCompatActivity {
    long lngNum;//store the number to check
    EditText et;//Allow user to type a long
    TextView tv;//Show result of test
    Timer timer=new Timer();//Used for a delay to provide user feedback
    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prime_number);
        et = (EditText) findViewById(R.id.editText1);
        tv = (TextView) findViewById(R.id.textView2);
        handler = new Handler(callback);
    }

    public void CheckPrimeClick(View arg0) {
        String number = et.getText().toString();
        tv.setText("Checking please wait.");
        try {
            lngNum=Long.parseLong(number);
        }catch(Exception ex){
            tv.setText("Error " + ex.getMessage() + " testing " + number);
            return;
        }
        timer.schedule(new SmallDelay(), 100);
    }

    /* Test for prime numbers
     * http://primes.utm.edu/curios/includes/primetest.php
     * also look at Java BigInteger isProbablePrime
     */
    public static boolean isPrime(long N) {
        // Trial divide the positive integer N by the primes from 2
        // Returns true if a prime divisor found, or false if none found
        if (N%2 == 0) return false;//Eliminates evens
        if (N%3 == 0) return false;//Eliminates multiples of three
        // No need to go past the square root of our number (see Sieve of Eratosthenes)
        long Stop = (long) Math.sqrt(N);
        // Okay, lets "wheel factor" alternately adding 2 and 4
        long di=2;
        for(long i=5; i<=Stop; i+=di, di=6-di) {
            if (N%i == 0) return false;
        };
        return true;
    }

    Handler.Callback callback = new Handler.Callback() {
        public boolean handleMessage(Message msg) {
            if(isPrime(lngNum)){
                tv.setText(et.getText() + " IS a prime.");
            }else{
                tv.setText(et.getText() + " IS NOT a prime.");
            }
            return true;
        }
    };

    class SmallDelay extends TimerTask {
        public void run() {
            handler.sendEmptyMessage(0);
        }
    }
}
