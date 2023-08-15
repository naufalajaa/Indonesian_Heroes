package com.example.indonesian_heroes.api;

import retrofit2.converter.gson.GsonConverterFactory;

public class Retrofit {

    public static final String URL = "https://raw.githubusercontent.com/";
    public static retrofit2.Retrofit retrofit=null;

    public static retrofit2.Retrofit getRetrofit(){
        if(retrofit==null){
            retrofit= new retrofit2.Retrofit.Builder()
                    .baseUrl(URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}


