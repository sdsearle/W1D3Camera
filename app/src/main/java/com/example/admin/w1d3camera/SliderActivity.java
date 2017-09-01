package com.example.admin.w1d3camera;

import android.net.sip.SipAudioCall;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class SliderActivity extends AppCompatActivity {

    SeekBar skbSlider;
    TextView tvSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider);

        skbSlider = (SeekBar) findViewById(R.id.skbSlider);
        tvSlider = (TextView) findViewById(R.id.tvSlider);

        skbSlider.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tvSlider.setText(Integer.toString(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }





}
