package com.ryansapps.ontheball.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author ryan
 */
public class JSONResponse {
    @SerializedName("DraftProjections")
    private List<Players> draftProjections;

    public List<Players> getResults() {
        return draftProjections;
    }

    public void setResults(List<Players> draftProjections) {
        this.draftProjections = draftProjections;
    }
}
