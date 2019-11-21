package com.example.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

public class SeekBarActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
    SeekBar seek1,seek2,seek3;
    ImageView imageView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_bar);


        seek1=findViewById(R.id.seek1);
        seek2=findViewById(R.id.seek2);
        seek3=findViewById(R.id.seek3);
        imageView=findViewById(R.id.img);




     seek1.setOnSeekBarChangeListener(this);
     seek2.setOnSeekBarChangeListener(this);
     seek3.setOnSeekBarChangeListener(this);

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b)
    {
            int r=0,g=0,b1=0;
        if(seekBar==seek1)
        {
            r=seek1.getProgress();
        }
        if(seekBar==seek2)
        {
            g=seek2.getProgress();
        }
        if(seekBar==seek3)
        {
            b1=seek3.getProgress();
        }

        imageView.setBackgroundColor(Color.rgb(r,g,b1));

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
