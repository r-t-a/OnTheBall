package com.ryansapps.ontheball.Model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * @author ryan
 */
public class Projections {
    @SerializedName("DraftProjections")
    private List<Players> DraftProjections;

    public List<Players> getResults() {
        return DraftProjections;
    }

    public void setResults(List<Players> draftProjections) {
        this.DraftProjections = draftProjections;
    }
}
