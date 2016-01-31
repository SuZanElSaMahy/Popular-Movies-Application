package com.example.dell2014.popularmovies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dell2014.popularmovies.Classes.Movie;

import static android.app.PendingIntent.getActivity;

public class MoviesDetail extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);


        if (savedInstanceState == null) {
            Bundle arguments = new Bundle();
            arguments.putParcelable(MoviesDetailFragment.DET_MOV,
                    getIntent().getParcelableExtra(MoviesDetailFragment.DET_MOV));

            MoviesDetailFragment fragment = new MoviesDetailFragment();
            fragment.setArguments(arguments);

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.movie_detail_container, fragment)
                    .commit();
        }



    }

}
