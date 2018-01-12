package com.example.jesus.estudio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {
    ListView coffeeList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        coffeeList = (ListView) findViewById(R.id.listView);
        String[] coffeeChoices = getResources().getStringArray(R.array.coffeeMenu);
        coffeeList.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,coffeeChoices));
       // coffeeList.setAdapter(new ArrayAdapter<String>(this,R.layout.listrow, R.id.textlistrow,coffeeChoices));
        coffeeList.setOnItemClickListener(new returnClickedItem());
    }

    class returnClickedItem implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            String item = (String) parent.getItemAtPosition(position);
            Intent data = new Intent();
            data.putExtra("Order",item);
            setResult(RESULT_OK, data);
            finish();
        }
    }
}
