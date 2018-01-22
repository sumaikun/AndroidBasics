package com.example.jesus.estudio;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MenuContextEActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_context_e);

        registerForContextMenu((ImageView) findViewById(R.id.imageView));
    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        menu.setHeaderTitle("Choose a filter");
        getMenuInflater().inflate(R.menu.color_menu, menu);
    }

    public boolean onContextItemSelected(MenuItem item) {
        ImageView imgv=(ImageView) findViewById(R.id.imageView);
        switch (item.getItemId()) {
            case R.id.menu_red:
                imgv.setColorFilter(Color.RED, PorterDuff.Mode.LIGHTEN);
                return true;
            case R.id.menu_blue:
                imgv.setColorFilter(Color.BLUE, PorterDuff.Mode.LIGHTEN);
                return true;
            case R.id.menu_green:
                imgv.setColorFilter(Color.GREEN, PorterDuff.Mode.LIGHTEN);
                return true;
            case R.id.menu_clear:
                imgv.setColorFilter(null);
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }
}
