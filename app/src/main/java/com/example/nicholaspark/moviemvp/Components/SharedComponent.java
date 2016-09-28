package com.example.nicholaspark.moviemvp.Components;

import com.example.nicholaspark.moviemvp.Clients.TmdbApiClient;
import com.example.nicholaspark.moviemvp.MainActivity;
import com.example.nicholaspark.moviemvp.Modules.AppModule;
import com.example.nicholaspark.moviemvp.Modules.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by nicholaspark on 9/28/16.
 */
@Singleton
@Component(modules = {AppModule.class, NetworkModule.class})
public interface SharedComponent {

    TmdbApiClient providesTmdbApiClient();
    void inject(MainActivity activity);
}
