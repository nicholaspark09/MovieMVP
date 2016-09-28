package com.example.nicholaspark.moviemvp.Data;

import android.support.annotation.NonNull;

import com.example.nicholaspark.moviemvp.Data.Local.Local;
import com.example.nicholaspark.moviemvp.Data.Remote.Remote;
import com.example.nicholaspark.moviemvp.Models.Movie;

import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

/**
 * Created by nicholaspark on 9/28/16.
 */
@Singleton
public class MoviesRepository implements MovieDataSource{

    private final MovieDataSource localDataSource;
    private final MovieDataSource remoteDataSource;

    //Create a constructor model telling Dagger to inject the local and remote data sources
    @Inject
    MoviesRepository(@Local @Named("localDataSource") MovieDataSource localDataSource, @Remote @Named("remoteDataSource") MovieDataSource remoteSource){
        this.localDataSource = localDataSource;
        this.remoteDataSource = remoteSource;
    }



    @Override
    public void getMovies(Map<String, String> params, @NonNull LoadMoviesCallback callback) {

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
