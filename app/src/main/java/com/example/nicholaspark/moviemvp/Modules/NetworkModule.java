package com.example.nicholaspark.moviemvp.Modules;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.example.nicholaspark.moviemvp.Clients.TmdbApiClient;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by nicholaspark on 9/28/16.
 */
@Module
public final class NetworkModule {

    String apiUrl;

    public NetworkModule(String url){
        this.apiUrl = url;
    }

    /**         Provides a SharedPreferences Singleton to the component
     *              The Context is provided by AppModule
     * */
    @Provides
    @Singleton
    SharedPreferences providesSharedPreferences(Context context){
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    @Provides
    @Singleton
    Gson providesGson(){
        GsonBuilder gsonBuilder = new GsonBuilder();
        return gsonBuilder.create();
    }

    @Provides
    @Singleton
    public TmdbApiClient providesTmdbApiClient(Gson gson){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(apiUrl)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        return retrofit.create(TmdbApiClient.class);
    }


}
