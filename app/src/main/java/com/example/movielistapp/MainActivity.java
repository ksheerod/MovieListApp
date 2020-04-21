package com.example.movielistapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.movielistapp.Adapter.AdapterMovieList;
import com.example.movielistapp.ModelView.MainModelView;
import com.example.movielistapp.Models.MovieModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements LifecycleOwner {

    MainActivity context;
    MainModelView mainModelView;
    RecyclerView rv_movie_listing;
    AdapterMovieList adapterMovieList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        context = this;
        rv_movie_listing = findViewById(R.id.rv_movie_list);
        mainModelView = new ViewModelProvider(this).get(MainModelView.class);
        mainModelView.getMovieLiveData().observe(context,movieListUpdateObserver);

    }

    Observer<ArrayList<MovieModel>> movieListUpdateObserver = new Observer<ArrayList<MovieModel>>() {
        @Override
        public void onChanged(ArrayList<MovieModel> movieModels) {

            adapterMovieList = new AdapterMovieList(context,movieModels);
            rv_movie_listing.setLayoutManager(new GridLayoutManager(context,2));
            rv_movie_listing.setAdapter(adapterMovieList);

        }
    };
}
