package com.example.jesus.estudio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class EseekBar extends AppCompatActivity  implements SeekBar.OnSeekBarChangeListener{
    TextView mProgressText;
    TextView mTrackingText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eseek_bar);
        ((SeekBar)findViewById(R.id.seek)).setOnSeekBarChangeListener(this);
        mProgressText = (TextView)findViewById(R.id.progress);
        mTrackingText = (TextView)findViewById(R.id.tracking);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromTouch) {
        mProgressText.setText(progress + " " +
                getString(R.string.seekbar_from_touch) + "=" + fromTouch);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        mTrackingText.setText(getString(R.string.seekbar_tracking_on));
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        mTrackingText.setText(getString(R.string.seekbar_tracking_off));
    }
}
