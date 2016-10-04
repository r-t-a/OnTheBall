package com.ryansapps.ontheball.Model;

import com.google.gson.annotations.SerializedName;

/**
 * What to Expect (QB):
 *
 * {
 *      "playerId":"14","completions":"422","attempts":"640",
 *      "passingYards":"4992","passingTD":"40","passingInt":"17",
 *      "rushYards":"28","rushTD":"1","fantasyPoints":"335",
 *      "displayName":"Drew Brees","team":"NO"
 * },
 *
 * @author ryan
 */

public class Players {
    @SerializedName("displayName")
    protected String displayName;
    @SerializedName("fantasyPoints")
    protected String fantasyPoints;
    @SerializedName("team")
    protected String team;

    public Players(String displayName, String fantasyPoints, String team) {
        this.displayName = displayName;
        this.fantasyPoints = fantasyPoints;
        this.team = team;
    }

    public String getFantasyPoints() {
        return fantasyPoints;
    }

    public String getTeam() {
        return team;
    }

    public String getName() {
        return displayName;
    }
}