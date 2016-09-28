package com.example.nicholaspark.moviemvp.Data;

import android.content.Context;

import com.example.nicholaspark.moviemvp.Data.Local.Local;
import com.example.nicholaspark.moviemvp.Data.Local.MovieLocalDataSource;
import com.example.nicholaspark.moviemvp.Data.MovieDataSource;
import com.example.nicholaspark.moviemvp.Data.Remote.MovieRemoteDataSource;
import com.example.nicholaspark.moviemvp.Data.Remote.Remote;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by nicholaspark on 9/28/16.
 *
 *      This is providing a MovieRepositoryClient to the MovieRepository Class
 *
 *      Dagger will freak out because you are adding two objects of the same type
 *
 *          !!!! To avoid this bug, use the @Named("") annotation to indicate two distinct objects
 *              of the same type !!!!!!
 */
@Module
public class MoviesRepositoryModule {

    @Singleton
    @Provides
    @Local
    @Named("localDataSource")
    MovieDataSource provideMoviesLocalDataSource(Context context){
        return new MovieLocalDataSource(context);
    }



    @Singleton
    @Provides
    @Remote
    @Named("remoteDataSource")
    MovieDataSource provideMoviesRemoteDataSource(){
        return new MovieRemoteDataSource();
    }

}
