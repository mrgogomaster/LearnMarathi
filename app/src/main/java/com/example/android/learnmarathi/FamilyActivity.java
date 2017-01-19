package com.example.android.learnmarathi;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        final ArrayList<Word> familyMembers = new ArrayList<Word>();
        familyMembers.add(new Word("Bābā (बाबा)","Father",R.drawable.family_father,R.raw.baba));
        familyMembers.add(new Word("Āī (आई)","Mother",R.drawable.family_mother,R.raw.aai));
        familyMembers.add(new Word("Bhāū (भाऊ)","Brother",R.drawable.family_older_brother,R.raw.bhau));
        familyMembers.add(new Word("Bahiņ (बहिण)","Sister",R.drawable.family_older_sister,R.raw.bahin));
        familyMembers.add(new Word("Ājobā (आजोबा)","Grand Father",R.drawable.family_grandfather,R.raw.ajoba));
        familyMembers.add(new Word("Ājī (आजी)","Grand Mother",R.drawable.family_grandmother,R.raw.ajju));
        familyMembers.add(new Word("Māmā (मामा)","Maternal Uncle",R.drawable.family_father,R.raw.mama));
        familyMembers.add(new Word("Māmī (मामी)","Maternal Uncle's wife",R.drawable.family_mother,R.raw.mamiiii));
        familyMembers.add(new Word("Māvshī (मावशी)","Maternal Aunt",R.drawable.family_mother,R.raw.mavsiii));
        familyMembers.add(new Word("Kākā (काका)","Paternal Uncle",R.drawable.family_father,R.raw.kaka));
        familyMembers.add(new Word("Kākī (काकी)","Paternal Uncle's wife",R.drawable.family_mother,R.raw.kakiii));
        familyMembers.add(new Word("Ātyā (आत्या)","Paternal Aunt",R.drawable.family_mother,R.raw.attya));
        familyMembers.add(new Word("Dīr (दीर)","Brother of your husband",R.drawable.family_father,R.raw.dir));
        familyMembers.add(new Word("Naņand (नणंद)","Sister of your husband",R.drawable.family_daughter,R.raw.nanand));
        familyMembers.add(new Word("Mevhņā (मेव्हणा)","Brother of your wife",R.drawable.family_older_brother,R.raw.mevna));
        familyMembers.add(new Word("Mevhnī (मेव्हणी)","Sister of your wife",R.drawable.family_daughter,R.raw.mevni));
        familyMembers.add(new Word("Tāī (ताई)","Elder sister of your wife",R.drawable.family_older_sister,R.raw.tai));
        familyMembers.add(new Word("Vahinī (वहिनी)","Wife of your brother",R.drawable.family_mother,R.raw.vahiniiii));
        familyMembers.add(new Word("Dājī (दाजी)","husband of your Sister",R.drawable.family_older_brother,R.raw.daji));
        familyMembers.add(new Word("Sāsre (सासरे)","Father of your spouse",R.drawable.family_father,R.raw.sasre));
        familyMembers.add(new Word("Sāsū (सासू)","Mother of your spouse",R.drawable.family_mother,R.raw.sasu));
        familyMembers.add(new Word("Mitra (मित्र)","Friend",R.drawable.family_son,R.raw.mitra));





        WordAdapter familyAdapter = new WordAdapter(this,familyMembers,R.color.category_family);
        ListView familyList = (ListView) findViewById(R.id.root_family);
        familyList.setAdapter(familyAdapter);

        familyList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Word word =familyMembers.get(position);
                MediaPlayer mMediaPlayer = MediaPlayer.create(FamilyActivity.this,word.getAudioManager());
                mMediaPlayer.start();
            }
        });
    }
}
