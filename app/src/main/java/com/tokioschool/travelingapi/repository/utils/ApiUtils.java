package com.tokioschool.travelingapi.repository.utils;

import com.tokioschool.travelingapi.repository.api.ApiHotels;
import com.tokioschool.travelingapi.repository.api.ApiWeather;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

abstract public class ApiUtils {

    private static final String HOST_HOTELS="https://hotels-com-provider.p.rapidapi.com/";
    private static final String HOST_WEATHER="api.openweathermap.org/";

    public static ApiHotels getApiHotels(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(HOST_HOTELS)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return  retrofit.create(ApiHotels.class);
    }
    public static ApiWeather getApiWheather(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(HOST_WEATHER)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return  retrofit.create(ApiWeather.class);
    }
}
