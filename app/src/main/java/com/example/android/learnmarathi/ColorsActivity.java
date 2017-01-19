package com.example.android.learnmarathi;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        final ArrayList<Word> colors =new ArrayList<Word>();
        colors.add(new Word("Pandhra (पांढरा)","White",R.drawable.color_white,R.raw.pandhra));
        colors.add(new Word("Kala (काळा)","Black",R.drawable.color_black,R.raw.kala));
        colors.add(new Word("Hirwa (हिरवा)","Green",R.drawable.color_green,R.raw.hirwa));
        colors.add(new Word("Karda (करडा)","Gray",R.drawable.color_gray,R.raw.karda));
        colors.add(new Word("Nila (निळा)","Blue",R.drawable.color_blue,R.raw.nila));
        colors.add(new Word("Tapkiri (तपकिरी)","Brown",R.drawable.color_brown,R.raw.tapkiriiii));
        colors.add(new Word("Narangi (नारंगी)","Orange",R.drawable.color_orange,R.raw.narangi));
        colors.add(new Word("Lal (लाल)","Red",R.drawable.color_red,R.raw.lal));
        colors.add(new Word("Piwla (पिवळा)","Yellow",R.drawable.color_yellow,R.raw.piwla));

        WordAdapter colorsAdapter = new WordAdapter(this,colors,R.color.category_colors);
        ListView colorList = (ListView) findViewById(R.id.root_colors);
        colorList.setAdapter(colorsAdapter);

        colorList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Word word = colors.get(position);
                MediaPlayer mMediaPlayer = MediaPlayer.create(ColorsActivity.this,word.getAudioManager());
                mMediaPlayer.start();

            }
        });

    }
}
