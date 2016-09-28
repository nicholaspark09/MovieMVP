package com.example.nicholaspark.moviemvp.Activities;

import android.app.Application;

import com.example.nicholaspark.moviemvp.Data.DaggerMoviesRepositoryComponent;
import com.example.nicholaspark.moviemvp.Data.MoviesRepositoryComponent;
import com.example.nicholaspark.moviemvp.Data.MoviesRepositoryModule;
import com.example.nicholaspark.moviemvp.Modules.AppModule;

/**
 * Created by nicholaspark on 9/28/16.
 */

public class MovieMVP extends Application {

    private MoviesRepositoryComponent mMoviesRepositoryComponent;


    @Override
    public void onCreate() {
        super.onCreate();

        mMoviesRepositoryComponent = DaggerMoviesRepositoryComponent.builder()
                            .appModule(new AppModule(getApplicationContext()))
                .moviesRepositoryModule(new MoviesRepositoryModule()).build();
    }

    public MoviesRepositoryComponent getmMoviesRepositoryComponent(){
        return mMoviesRepositoryComponent;
    }


}
