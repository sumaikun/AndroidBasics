package com.example.jesus.estudio;

import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Search extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        findViewById(R.id.ImageButton).setOnClickListener(new HandleClick());
    }

    private class HandleClick implements View.OnClickListener {
        public void onClick(View arg0) {
            String searchFor = ((EditText) findViewById(R.id.EditText)).getText().toString();
            Intent viewSearch = new Intent(Intent.ACTION_WEB_SEARCH);
            viewSearch.putExtra(SearchManager.QUERY, searchFor);
            startActivity(viewSearch);
        }
    }
}
