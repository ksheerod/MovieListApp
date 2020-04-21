package com.example.movielistapp.ModelView;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.movielistapp.Models.MovieModel;

import java.util.ArrayList;

public class MainModelView extends ViewModel {

    MutableLiveData<ArrayList<MovieModel>> movieLiveData;
    ArrayList<MovieModel> movieModelArrayList;

    public MainModelView(){

        movieLiveData = new MutableLiveData<>();
        init();

    }

    public MutableLiveData<ArrayList<MovieModel>> getMovieLiveData() {
        return movieLiveData;
    }

    public void init(){

        //retro fit call will come here

        //adding sample data
        sampleData();
        movieLiveData.setValue(movieModelArrayList);

    }

    public void  sampleData(){

        movieModelArrayList = new ArrayList<>();

        movieModelArrayList.add(new MovieModel());
        movieModelArrayList.add(new MovieModel());
        movieModelArrayList.add(new MovieModel());
        movieModelArrayList.add(new MovieModel());
        movieModelArrayList.add(new MovieModel());
        movieModelArrayList.add(new MovieModel());
        movieModelArrayList.add(new MovieModel());
        movieModelArrayList.add(new MovieModel());
        movieModelArrayList.add(new MovieModel());
        movieModelArrayList.add(new MovieModel());

    }

}
