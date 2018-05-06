package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //create view variable to hold view parameter information
        View listItemView = convertView;
        //check if listItemView is null
        if(listItemView == null) {
            //if null set listItemView to the inflated list item layout within the view group
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        //create variable to hold the current word at the specified position in the array list
        Word currentWord = getItem(position);
        //find text views in the layout
        TextView miwokText = listItemView.findViewById(R.id.miwok_text_view);
        TextView defaultText = listItemView.findViewById(R.id.default_text_view);
        //set text of each text view to the correct word translation
        miwokText.setText(currentWord.getMiwokTranslation());
        defaultText.setText(currentWord.getDefaultTranslation());
        //return the view
        return listItemView;
    }
}
