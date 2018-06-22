package com.example.mylibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokesAnd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lib);

        String joke_final = getIntent().getStringExtra("Final Joke:");
        TextView final_joke_tv = (TextView) findViewById(R.id.joke);
        final_joke_tv.setText(joke_final);
    }

}
