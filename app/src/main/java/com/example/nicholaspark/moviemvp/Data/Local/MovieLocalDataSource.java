package com.example.nicholaspark.moviemvp.Data.Local;

import android.content.Context;
import android.support.annotation.NonNull;

import com.example.nicholaspark.moviemvp.Data.MovieDataSource;
import com.example.nicholaspark.moviemvp.Data.MoviesDB;
import com.example.nicholaspark.moviemvp.Models.Movie;

import java.util.Map;

import javax.inject.Singleton;

/**
 * Created by nicholaspark on 9/28/16.
 */
@Singleton
public class MovieLocalDataSource implements MovieDataSource {

    private MoviesDB db;

    public MovieLocalDataSource(@NonNull Context context){
        db = new MoviesDB(context);
    }


    @Override
    public void getMovies(Map<String, String> params, @NonNull final LoadMoviesCallback callback) {

    }

    @Override
    public void getMovie(@NonNull int id, @NonNull GetMovieCallback callback) {

    }

    @Override
    public void saveMovie(@NonNull Movie movie) {

    }

    @Override
    public void deleteAllMovies() {

    }

    @Override
    public void deleteMovie(@NonNull int movieId) {

    }
}
