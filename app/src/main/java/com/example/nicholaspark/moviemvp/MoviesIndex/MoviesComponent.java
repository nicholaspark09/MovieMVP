package com.example.nicholaspark.moviemvp.MoviesIndex;

import com.example.nicholaspark.moviemvp.Data.MoviesRepositoryComponent;
import com.example.nicholaspark.moviemvp.Helpers.FragmentScoped;

import dagger.Component;

/**
 * Created by nicholaspark on 9/28/16.
 *
 *      Objects are Instantiated in the Modules,
 *         Components inject the objects (services) into the Activities/Fragments
 *
 */
@FragmentScoped
@Component(dependencies = MoviesRepositoryComponent.class, modules = MoviesPresenterModule.class)
public interface MoviesComponent {
    void inject(MainActivity activity);
}
