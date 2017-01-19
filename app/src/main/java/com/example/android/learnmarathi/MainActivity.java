package com.example.android.learnmarathi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbers= (TextView) findViewById(R.id.number);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Enjoy the Numbers",Toast.LENGTH_SHORT).show();
                Intent numbers=new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(numbers);
            }
        });
        TextView family= (TextView) findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Enjoy the Family Members",Toast.LENGTH_SHORT).show();
                Intent family =new Intent(MainActivity.this,FamilyActivity.class);
                startActivity(family);
            }
        });
        TextView colors= (TextView) findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Enjoy the Colours",Toast.LENGTH_SHORT).show();
                Intent colors=new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(colors);
            }
        });
        TextView phrases= (TextView) findViewById(R.id.phrase);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Enjoy the Phrases",Toast.LENGTH_SHORT).show();
                Intent phrases=new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(phrases);
            }
        });
    }

}
