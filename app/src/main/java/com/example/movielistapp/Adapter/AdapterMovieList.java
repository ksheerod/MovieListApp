package com.example.movielistapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.movielistapp.Models.MovieModel;
import com.example.movielistapp.R;

import java.util.ArrayList;

public class AdapterMovieList extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context context;
    ArrayList<MovieModel> movieModelArrayList;

    public AdapterMovieList(Context context, ArrayList<MovieModel> movieModelArrayList) {
        this.context = context;
        this.movieModelArrayList = movieModelArrayList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_movie,parent,false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return movieModelArrayList.size();
    }

    class CustomViewHolder extends  RecyclerView.ViewHolder{

        ImageView iv_movie_image;
        TextView tv_movie_name;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);

            iv_movie_image = itemView.findViewById(R.id.iv_movie_image);
            tv_movie_name = itemView.findViewById(R.id.tv_movie_name);

        }
    }

}
