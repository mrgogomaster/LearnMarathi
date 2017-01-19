package com.example.android.learnmarathi;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.view.LayoutInflater;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Tapan on 11/22/2016.
 */


public class WordAdapter extends ArrayAdapter<Word> {
    private int mColor;

    private static final String LOG_TAG =WordAdapter.class.getSimpleName();

    public WordAdapter(Activity context, ArrayList<Word> numberList,int color) {

        super(context, 0, numberList);
        mColor = color;
    }

    public View getView(int postion,View convertview,ViewGroup parent){
        View listItemView=convertview;
        if(listItemView==null){
            listItemView=LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        Word numbers=getItem(postion);

        TextView marathiTranslate = (TextView) listItemView.findViewById(R.id.marathi_text);
        marathiTranslate.setText(numbers.getMarathiTranslation());

        TextView defaultTranslate= (TextView) listItemView.findViewById(R.id.English_text);
        defaultTranslate.setText(numbers.getDefaultTranslation());

        ImageView icon = (ImageView) listItemView.findViewById(R.id.image_icon);
        if(numbers.hasImage()) {
            icon.setImageResource(numbers.getNumberImages());
            icon.setVisibility(View.VISIBLE);
        }
        else{
            icon.setVisibility(View.GONE);
        }
        View textContainer =listItemView.findViewById(R.id.text_container);

        int color= ContextCompat.getColor(getContext(),mColor);

        textContainer.setBackgroundColor(color);

        return listItemView;


    }

}
