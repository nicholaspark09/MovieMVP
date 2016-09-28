package com.example.nicholaspark.moviemvp.MoviesIndex;

import com.example.nicholaspark.moviemvp.Helpers.MoviesContract;

import dagger.Module;
import dagger.Provides;

/**
 * Created by nicholaspark on 9/28/16.
 */
@Module
public class MoviesPresenterModule {

    private final MoviesContract.View mView;

    public MoviesPresenterModule(MoviesContract.View view){
        mView = view;
    }

    @Provides
    MoviesContract.View providesMoviesView(){
        return mView;
    }
}
