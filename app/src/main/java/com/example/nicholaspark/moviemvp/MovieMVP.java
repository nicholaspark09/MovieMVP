package com.example.nicholaspark.moviemvp;

import android.app.Application;
import android.net.Network;

import com.example.nicholaspark.moviemvp.Data.DaggerMoviesRepositoryComponent;
import com.example.nicholaspark.moviemvp.Data.MoviesRepositoryComponent;
import com.example.nicholaspark.moviemvp.Data.MoviesRepositoryModule;
import com.example.nicholaspark.moviemvp.Modules.AppModule;
import com.example.nicholaspark.moviemvp.Modules.NetworkModule;


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
                .networkModule(new NetworkModule("https://api.github.com"))
                .moviesRepositoryModule(new MoviesRepositoryModule()).build();
    }

    public MoviesRepositoryComponent getmMoviesRepositoryComponent(){
        return mMoviesRepositoryComponent;
    }


}
