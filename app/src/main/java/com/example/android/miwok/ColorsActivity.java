package com.example.android.miwok;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    MediaPlayer wordPlayer;

    AudioManager audioManager;

    private AudioManager.OnAudioFocusChangeListener focusChangeListener = new AudioManager.OnAudioFocusChangeListener() {
        @Override
        public void onAudioFocusChange(int focusChange) {
            switch(focusChange) {
                case AudioManager.AUDIOFOCUS_LOSS_TRANSIENT:
                    wordPlayer.stop();
                    wordPlayer.seekTo(0);
                    break;
                case AudioManager.AUDIOFOCUS_LOSS:
                    releaseMediaPlayer();
                    break;
                case AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK:
                    wordPlayer.stop();
                    wordPlayer.seekTo(0);
                    break;
                case AudioManager.AUDIOFOCUS_GAIN:
                    wordPlayer.start();
                    break;
            }
        }
    };

    private MediaPlayer.OnCompletionListener completionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            releaseMediaPlayer();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        audioManager = (AudioManager) getApplicationContext().getSystemService(Context.AUDIO_SERVICE);

        assert audioManager != null;
        final int result = audioManager.requestAudioFocus(focusChangeListener, AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);

        //create new array list object
        final ArrayList<Word> words = new ArrayList<>();

        //add word objects to array list
        words.add(new Word("red", "weṭeṭṭi", R.drawable.color_red, R.raw.color_red));
        words.add(new Word("green","chokokki", R.drawable.color_green, R.raw.color_green));
        words.add(new Word("brown","ṭakaakki", R.drawable.color_brown, R.raw.color_brown));
        words.add(new Word("gray","ṭopoppi", R.drawable.color_gray, R.raw.color_gray));
        words.add(new Word("black", "kululli", R.drawable.color_black, R.raw.color_black));
        words.add(new Word("white", "kelelli", R.drawable.color_white, R.raw.color_white));
        words.add(new Word("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        words.add(new Word("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));
        //finds the list view in the view hierarchy
        ListView rootView = findViewById(R.id.list);
        //creates an word adapter object to iterate through the array list and set each item to a layout holding two text views
        WordAdapter wordAdapter = new WordAdapter(this, words, R.color.category_colors);
        //set the word adapter object to the list view
        rootView.setAdapter(wordAdapter);

        rootView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                releaseMediaPlayer();

                if (audioManager != null && result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
                    wordPlayer = MediaPlayer.create(ColorsActivity.this, words.get(position).getAudio());
                    wordPlayer.start();
                    wordPlayer.setOnCompletionListener(completionListener);
                }
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }

    private void releaseMediaPlayer() {
        if(wordPlayer != null) {
            wordPlayer.release();
            wordPlayer = null;
            audioManager.abandonAudioFocus(focusChangeListener);
        }
    }
}
