package com.example.nicholaspark.moviemvp.Data;

import android.support.annotation.NonNull;

import com.example.nicholaspark.moviemvp.Models.Movie;

import java.util.List;
import java.util.Map;

/**
 * Created by nicholaspark on 9/28/16.
 *
 *  Whether it's local SQLite or RESTFUL API,
 *
 *          The classes that implement this interface must have the methods inside
 */

public interface MovieDataSource {

    interface LoadMoviesCallback{
        void onMoviesLoaded(List<Movie> movies);
        void onDataNotAvailable();
    }

    interface GetMovieCallback{
        void onMovieLoaded(Movie movie);
        void onDataNotAvailable();
    }

    void getMovies(Map<String,String> params,@NonNull LoadMoviesCallback callback);
    void getMovie(@NonNull int id, @NonNull GetMovieCallback callback);
    void saveMovie(@NonNull Movie movie);
    void deleteAllMovies();
    void deleteMovie(@NonNull int movieId);
}
