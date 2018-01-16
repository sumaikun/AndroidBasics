package com.example.jesus.estudio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MultLines extends AppCompatActivity {
    private SimpleAdapter sa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mult_lines);
        ArrayList<HashMap<String,String>> list = new ArrayList<HashMap<String,String>>();
        HashMap<String,String> item;

        for(int i=0;i<States_Capitals_Population.length;i++){
            item = new HashMap<String,String>();
            item.put( "line1", States_Capitals_Population[i][0]);
            item.put( "line2", States_Capitals_Population[i][1]);
            item.put( "line3", States_Capitals_Population[i][2]);
            list.add( item );
        }

        sa = new SimpleAdapter(this, list,
                R.layout.mult_lines_style,
                new String[] { "line1","line2", "line3" },
                new int[] {R.id.line_a, R.id.line_b, R.id.line_c});

        ((ListView)findViewById(R.id.list)).setAdapter(sa);

        ((ListView)findViewById(R.id.list)).setOnItemClickListener(new AdapterView.OnItemClickListener() {
            /*public void onItemClick(AdapterView<?> adapter, View view, int position, long id) {
                StringBuilder sb = new StringBuilder("Selected:\n");
                //By position in array
                sb.append(States_Capitals_Population[position][0]+"\n");
                sb.append(States_Capitals_Population[position][1]+"\n");
                sb.append(States_Capitals_Population[position][2]+"\n");
                Toast.makeText(MultLines.this, sb.toString(), Toast.LENGTH_LONG).show();
            }*/
            public void onItemClick(AdapterView<?> adapter, View view, int position, long id) {
                //By finding view id
                TextView v=(TextView) view.findViewById(R.id.line_a);
                StringBuilder sb = new StringBuilder("Selected:\n");
                sb.append(v.getText()+"\n");
                v=(TextView) view.findViewById(R.id.line_b);
                sb.append(v.getText()+"\n");
                v=(TextView) view.findViewById(R.id.line_c);
                sb.append(v.getText()+"\n");
                Toast.makeText(MultLines.this, sb.toString(), Toast.LENGTH_LONG).show();
            }
        });


    }



    private String[][] States_Capitals_Population =
            {{"Alabama","Montgomery","4,833,722"},
                    {"Alaska","Juneau","735,132"},
                    {"Arizona","Phoenix","6,626,624"},
                    {"Arkansas","Little Rock","2,959,373"},
                    {"California","Sacramento","38,332,521"},
                    {"Colorado","Denver","5,268,367"},
                    {"Connecticut","Hartford","3,596,080"},
                    {"Delaware","Dover","925,749"},
                    {"Florida","Tallahassee","19,552,860"},
                    {"Georgia","Atlanta","9,992,167"},
                    {"Hawaii","Honolulu","1,404,054"},
                    {"Idaho","Boise","1,612,136"},
                    {"Illinois","Springfield","12,882,135"},
                    {"Indiana","Indianapolis","6,570,902"},
                    {"Iowa","Des Moines","3,090,416"},
                    {"Kansas","Topeka","2,893,957"},
                    {"Kentucky","Frankfort","4,395,295"},
                    {"Louisiana","Baton Rouge","4,625,470"},
                    {"Maine","Augusta","1,328,302"}};
}
