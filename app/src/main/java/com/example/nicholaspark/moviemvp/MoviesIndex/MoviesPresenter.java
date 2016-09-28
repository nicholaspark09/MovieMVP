package com.example.nicholaspark.moviemvp.MoviesIndex;

import android.support.annotation.NonNull;
import android.util.Log;

import com.example.nicholaspark.moviemvp.Data.MovieDataSource;
import com.example.nicholaspark.moviemvp.Data.MoviesRepository;
import com.example.nicholaspark.moviemvp.Helpers.MoviesContract;
import com.example.nicholaspark.moviemvp.Models.Movie;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

/**
 * Created by nicholaspark on 9/28/16.
 *
 *
 *      This gets the data, starts threads, and returns them to the view
 *
 *              The View(Activity or fragment) shouldn't have to worry about
 *              threads or getting data, so we're doing it in the presenter
 *
 */
final class MoviesPresenter implements MoviesContract.Presenter{

    private final MoviesRepository dataRepository;
    private final MoviesContract.View view;

    //Inject the DataRepository, Dagger instantiates it outside in the MoviesRepositoryModule and injects it
    //Use the constructor to inject the Repository and the View
    //The view in this case is a fragment
    @Inject
    MoviesPresenter(MoviesRepository moviesRepository, MoviesContract.View moviesView){
        dataRepository = moviesRepository;
        view = moviesView;
    }

    @Inject
    void setupListeners(){
        view.setPresenter(this);
    }

    @Override
    public void result(int requestCode, int resultCode) {

    }

    @Override
    public void loadMovies(boolean forceUpdate) {
        Map<String,String> params = new HashMap<>();
        dataRepository.getMovies(params, new MovieDataSource.LoadMoviesCallback() {
            @Override
            public void onMoviesLoaded(List<Movie> movies) {

            }

            @Override
            public void onDataNotAvailable() {

            }
        });
    }

    @Override
    public void addNewMovie() {

    }

    @Override
    public void openMovieDetails(@NonNull Movie movie) {

    }

    @Override
    public void start() {

    }
}
