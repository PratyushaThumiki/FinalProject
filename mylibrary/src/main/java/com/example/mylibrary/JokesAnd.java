package com.example.mylibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class JokesAnd extends AppCompatActivity {

    public final static String JOKE_KEY = "com.example.mylibrary.joke_key";
    private String Joke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lib);

        TextView jokeTv = (TextView) findViewById(R.id.joke);

        if (getIntent().hasExtra(JOKE_KEY))
            Joke = getIntent().getStringExtra(JOKE_KEY);

        if (Joke != null && Joke.length() != 0) {
            jokeTv.setVisibility(View.VISIBLE);
            jokeTv.setText(Html.fromHtml(Joke));
        }
        else {
            jokeTv.setVisibility(View.GONE);
        }
    }


}
