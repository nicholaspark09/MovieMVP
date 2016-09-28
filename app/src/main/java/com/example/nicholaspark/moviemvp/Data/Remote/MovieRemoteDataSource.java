package com.example.nicholaspark.moviemvp.Data.Remote;

import android.support.annotation.NonNull;
import android.util.Log;

import com.example.nicholaspark.moviemvp.Clients.TmdbApiClient;
import com.example.nicholaspark.moviemvp.Data.MovieDataSource;
import com.example.nicholaspark.moviemvp.Models.Movie;
import com.example.nicholaspark.moviemvp.Modules.NetworkModule;

import java.util.Map;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by nicholaspark on 9/28/16.
 */
@Singleton
public class MovieRemoteDataSource implements MovieDataSource {

    private static final String TAG = MovieRemoteDataSource.class.getSimpleName();



    @Override
    public void getMovies(Map<String, String> params, @NonNull LoadMoviesCallback callback) {
        Log.d(TAG,"Getting movies...");
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
