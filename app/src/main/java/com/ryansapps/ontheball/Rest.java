package com.ryansapps.ontheball;

import android.support.annotation.NonNull;

import com.ryansapps.ontheball.Interface.PlayerApi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author ryan
 */
public enum  Rest {
    INSTANCE;
    public final static String DOMAIN = "http://www.fantasyfootballnerd.com/service/draft-projections/json/test/";
    private final PlayerApi api;
    Rest() {
        final Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(DOMAIN)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        api = retrofit.create(PlayerApi.class);
    }
    public @NonNull
    PlayerApi api() {
        return api;
    }
}
