package com.udacity.gradle.builditbigger;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.mylibrary.JavaJokeLib;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);

        Button button = root.findViewById(R.id.button_joke_display);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JavaJokeLib javaJokeLib = new JavaJokeLib();
                String joke = javaJokeLib.getJoke();

                //Toast.makeText(getActivity(), joke, Toast.LENGTH_SHORT).show();
                //Intent intent = new Intent(getContext(), JokeDisplayActivity.class);
                //intent.putExtra(JokeDisplayActivity.JOKE_DATA, joke);
                //startActivity(intent);

                new EndpointsAsyncTask().execute(new android.support.v4.util.Pair<>(getContext(), joke));

            }
        });

        return root;
    }
}
