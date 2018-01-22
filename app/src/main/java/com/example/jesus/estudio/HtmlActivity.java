package com.example.jesus.estudio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class HtmlActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_html);
        WebView myWebView = (WebView) findViewById(R.id.webView1);
        myWebView.loadUrl("file:///android_asset/crocodile.html");

    }
}
