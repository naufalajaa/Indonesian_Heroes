package com.example.indonesian_heroes.api;


import com.example.indonesian_heroes.Pahlawan;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Apipahlawan {

    @GET("AzharRivaldi/Sejarah-Pahlawan-Indonesia/master/app/src/main/assets/pahlawan_nasional.json")
    Call<Pahlawan> getAllPahlawan();

}

