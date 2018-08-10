package com.seekbarseries;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends Activity {
    private SeekBar seek;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = (ImageView) findViewById(R.id.image_id);
        seek = (SeekBar) findViewById(R.id.seekBar_id);

        seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
             int prog = progress;

                if(prog == 1){
                    image.setImageResource(R.drawable.pouco);
                }else if(prog==2){
                    image.setImageResource(R.drawable.medio);
                }else if(prog==3){
                    image.setImageResource(R.drawable.muito);
                }else if(prog==4){
                    image.setImageResource(R.drawable.susto);
                }
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
