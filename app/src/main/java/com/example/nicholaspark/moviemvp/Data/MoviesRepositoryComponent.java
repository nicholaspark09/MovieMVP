package com.example.nicholaspark.moviemvp.Data;


import com.example.nicholaspark.moviemvp.Modules.AppModule;
import com.example.nicholaspark.moviemvp.Modules.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by nicholaspark on 9/28/16.
 */
@Singleton
@Component(dependencies = NetworkModule.class, modules = {MoviesRepositoryModule.class, AppModule.class})
public interface MoviesRepositoryComponent {

    MoviesRepository getMoviesRepository();
}
