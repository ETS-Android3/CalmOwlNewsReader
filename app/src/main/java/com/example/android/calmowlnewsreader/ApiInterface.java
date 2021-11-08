package com.example.android.calmowlnewsreader;

import com.example.android.calmowlnewsreader.Model.Headlines;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("top-headlines")
    Call<Headlines> getHeadlines (
    @Query("country") String country,
    @Query("apiKey") String apikey
    );
    @GET("everything")
    Call<Headlines> getSpecificData (
            @Query("q") String query,
            @Query("apiKey") String apikey
    );





}
