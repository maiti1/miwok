package com.example.android.miwok;

import android.app.Activity;
import android.app.LauncherActivity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.LayoutInflaterFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Admin on 2017/01/19.
 */

public class wordAdapter extends ArrayAdapter<word> {

    private int mcolorResourceID;

    public wordAdapter(Activity context,ArrayList<word>words,int colorResourceId)
    {
        super(context,0,words);
        mcolorResourceID = colorResourceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //check if the existing view is being reused, otherwise inflate the view
        View listView = convertView;
        if(listView == null)
        {
            listView = LayoutInflater.from(getContext()).inflate(R.layout.list_items,parent,false);
        }

        word currentWord = getItem(position);

        TextView miwokWord = (TextView) listView.findViewById(R.id.miwok_text_view);
        miwokWord.setText(currentWord.getMiwokTranslation());

        TextView defaultWord = (TextView)listView.findViewById(R.id.default_text_view);
        defaultWord.setText(currentWord.getDefaultTransalation());

        ImageView resourceId = (ImageView)listView.findViewById(R.id.image);

        if(currentWord.hasImage())
        {
            resourceId.setImageResource(currentWord.getmResourceID());
        }
        else{
            resourceId.setVisibility(View.GONE);
        }

        View textContainer = listView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),mcolorResourceID);
        textContainer.setBackgroundColor(color);

        return listView;
    }
}
