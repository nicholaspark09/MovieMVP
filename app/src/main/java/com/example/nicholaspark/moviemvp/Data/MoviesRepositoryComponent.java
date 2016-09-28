package com.example.nicholaspark.moviemvp.Data;

import com.example.nicholaspark.moviemvp.Data.MoviesRepository;
import com.example.nicholaspark.moviemvp.Data.MoviesRepositoryModule;
import com.example.nicholaspark.moviemvp.Modules.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by nicholaspark on 9/28/16.
 */
@Singleton
@Component(modules = {MoviesRepositoryModule.class, AppModule.class})
public interface MoviesRepositoryComponent {

    MoviesRepository getMoviesRepository();
}
