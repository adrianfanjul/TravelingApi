package com.tokioschool.travelingapi.repository.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface ApiHotels {
    @Headers({"x-rapidapi-host:hotels-com-provider.p.rapidapi.com",
    "x-rapidapi-key:4f6fc38079msh1ee2376be4d7ff5p172944jsn7efa51605351",
    "Content-Type:application/json"})
    @GET("v1/hotels/search")
    public Call<Object> searchHotels(
            @Query("checkin_date") String checkin,
            @Query("checkout_date") String checkout,
            @Query("short_order") String sort,
            @Query("destination_id") int destination_id,
            @Query("adults_number") int numberPersons,
            @Query("locale") String locale,
            @Query("currency") String currency
    );
}
