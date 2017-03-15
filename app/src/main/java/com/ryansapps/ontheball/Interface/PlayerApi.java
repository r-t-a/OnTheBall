package com.ryansapps.ontheball.Interface;

import com.ryansapps.ontheball.Model.Projections;
import retrofit2.http.GET;
import retrofit2.Call;
import retrofit2.http.Path;

/**
 * @author ryan
 */
public interface PlayerApi {
    @GET("{choice}/")
    Call<Projections> getDraftProjections(@Path("choice") String selection);
}
