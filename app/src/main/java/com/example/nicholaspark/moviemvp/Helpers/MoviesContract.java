package com.example.nicholaspark.moviemvp.Helpers;

import android.support.annotation.NonNull;

import com.example.nicholaspark.moviemvp.Models.Movie;
import com.example.nicholaspark.moviemvp.Presenters.BasePresenter;
import com.example.nicholaspark.moviemvp.Views.BaseView;

import java.util.List;

/**
 * Created by nicholaspark on 9/28/16.
 */

public interface MoviesContract {

    interface View extends BaseView<Presenter>{
        void showLoading();
        void showLoadingError();
        void showAddMovie();
        void showMovies(List<Movie> movies);
        void showNoTasks();
    }

    interface Presenter extends BasePresenter{
        void result(int requestCode, int resultCode);
        void loadMovies(boolean forceUpdate);
        void addNewMovie();
        void openMovieDetails(@NonNull Movie movie);
    }

}
