package com.jamestreasure.fantasyfootball.repository;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface FantasyPremierLeagueApiRetrofit {

    @Headers("Content-Type: application/json")
    @GET("/drf/leagues-classic-standings/670123")
   // @GET("/todos/1/")
    Call<ResponseBody> getLeagueStandings();
}
