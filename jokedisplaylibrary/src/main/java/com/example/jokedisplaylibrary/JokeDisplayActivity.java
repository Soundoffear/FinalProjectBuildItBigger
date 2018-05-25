package com.example.jokedisplaylibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class JokeDisplayActivity extends AppCompatActivity {

    public static final String JOKE_DATA = "Joke_data_rec_send";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);

        Intent intent = getIntent();
        String jokeRec = intent.getStringExtra(JOKE_DATA);

        TextView tv_joke = findViewById(R.id.textView_displayJoke);
        tv_joke.setText(jokeRec);
    }
}
