package com.example.android.learnmarathi;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {


    MediaPlayer mMediaPlayer =new MediaPlayer();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        final ArrayList<Word> phrases =new ArrayList<Word>();

        phrases.add(new Word("Namaskār (नमस्कार)","Greeting or Salutation",R.raw.namaskar));
        phrases.add(new Word("Suprabhāt (सुप्रभात)","Good Morning",R.raw.suprabhat));
        phrases.add(new Word("Shubh Rātri (शुभ रात्री)","Good Night",R.raw.shubhratri));
        phrases.add(new Word("Āpan kase āhāt? (आपण कसे आहात?)","How are you?",R.raw.aparnkaseahat));
        phrases.add(new Word("Āpale nāv kāy? (आपले नाव काय?)","What is your name?",R.raw.aplenavkaiii));
        phrases.add(new Word("Mājhe nāv _____. (माझे नाव _____)","My name is _____",R.raw.mazanav));
        phrases.add(new Word("Ho (हो)","Yes",R.raw.ho));
        phrases.add(new Word("Nāhi (नाही)","No",R.raw.nahi));
        phrases.add(new Word("Kitī vājale? (किती वाजले?)","What time is it?",R.raw.kitiwajleeeee));
        phrases.add(new Word("Chhān āhe. (छान आहे)","It's nice.",R.raw.changeaahe));
        phrases.add(new Word("Miī majet āhe. (मी मजेत आहे)","I am fine.",R.raw.mimajetaahe));
        phrases.add(new Word("Jevaņ jhāle kā? (जेवण झाले का?)","Did you have your meal?",R.raw.jevnzwleka));
        phrases.add(new Word("Kshamā karā. (क्षमा करा)","Sorry",R.raw.ksamakara));
        phrases.add(new Word("Mī āpalī kshamā māgato. (मी आपली क्षमा मागतो)","I apologize.",R.raw.miapliksamamaagto));
        phrases.add(new Word("Kripayā jarā sāvakāsh bolāl kā? (कृपया जरा सावकाश बोलाल का?)","Will you please speak a bit slowly?",R.raw.kripyasawkasbolalka));
        phrases.add(new Word("Bus thāmbā kuțhe āhe? (बस थांबा कुठे आहे?)","Where is the Bus stop?",R.raw.basthmbakotheahe));
        phrases.add(new Word("Namaskār (नमस्कार)","Hello",R.raw.namaskar));
        phrases.add(new Word("Achchhā (अच्छा)","Goodbye",R.raw.achha));
        phrases.add(new Word("Kripayā (कृपया)","Please",R.raw.krupaaya));
        phrases.add(new Word("Ābhār (आभार)","Thank you",R.raw.abhar));
        phrases.add(new Word("Kitī? (किती?)","How much?",R.raw.kiti));
        phrases.add(new Word("_____ kuțhe āhe? (कि_____ कुठे आहे?)","Where is _____?",R.raw.kutheahe));


        WordAdapter phraseAdapter = new WordAdapter(this,phrases,R.color.category_phrases);
        ListView listview = (ListView) findViewById(R.id.root_phrases);
        listview.setAdapter(phraseAdapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Word word = phrases.get(position);
                mMediaPlayer =MediaPlayer.create(PhrasesActivity.this,word.getAudioManager());
                mMediaPlayer.start();
            }
        });

    }
}
