package com.example.nicholaspark.moviemvp.Clients;

import com.example.nicholaspark.moviemvp.Models.Movie;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.GET;

/**
 * Created by nicholaspark on 9/28/16.
 */

public interface TmdbApiClient {


    @GET("/discover/movie")
    Call<List<Movie>> getMovies(@FieldMap Map<String,String> params);
}
