package com.example.nicholaspark.moviemvp.Modules;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by nicholaspark on 9/28/16.
 */
@Module
public final class AppModule {

    private final Context mContext;

    public AppModule(Context context){
        mContext = context;
    }

    //Provides the Application Context to the Component
    @Provides
    @Singleton
    Context providesContext(){
        return mContext;
    }


}
