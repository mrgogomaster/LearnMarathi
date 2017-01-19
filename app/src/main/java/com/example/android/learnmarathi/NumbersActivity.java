package com.example.android.learnmarathi;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer =new MediaPlayer();
    private MediaPlayer.OnCompletionListener mCompletionListener=new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            releaseResources();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        final ArrayList<Word> numberList = new ArrayList<Word>();
        numberList.add(new Word("Ek", "One", R.drawable.number_one, R.raw.ek));
        numberList.add(new Word("Don", "Two", R.drawable.number_two, R.raw.don));
        numberList.add(new Word("Teen", "Three", R.drawable.number_three, R.raw.teen));
        numberList.add(new Word("Char", "Four", R.drawable.number_four, R.raw.charrrr));
        numberList.add(new Word("Pach", "Five", R.drawable.number_five, R.raw.pach));
        numberList.add(new Word("Saha", "Six", R.drawable.number_six, R.raw.saha));
        numberList.add(new Word("Saat", "Seven", R.drawable.number_seven, R.raw.saat));
        numberList.add(new Word("Aath", "Eight", R.drawable.number_eight, R.raw.aath));
        numberList.add(new Word("Nau", "Nine", R.drawable.number_nine, R.raw.nau));
        numberList.add(new Word("Daha", "Ten", R.drawable.number_ten, R.raw.daha));

        WordAdapter numbersAdapter = new WordAdapter(this, numberList, R.color.category_numbers);
        ListView mListView = (ListView) findViewById(R.id.list);
        mListView.setAdapter(numbersAdapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Word word=numberList.get(position);
                releaseResources();
                mediaPlayer=MediaPlayer.create(NumbersActivity.this,word.getAudioManager());
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(mCompletionListener);
            }
        });

    }

    @Override
    protected void onStop() {
        super.onStop();
        releaseResources();

    }


    public void releaseResources(){

        if (mediaPlayer!=null){
            mediaPlayer.release();
            mediaPlayer=null;
        }
    }
}