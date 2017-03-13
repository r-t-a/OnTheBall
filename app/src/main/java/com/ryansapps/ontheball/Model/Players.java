package com.ryansapps.ontheball.Model;

import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;

/**
 * Stats available from api (QB):
 *
 * {
 *      "playerId":"14",
 *      "completions":"422",
 *      "attempts":"640",
 *      "passingYards":"4992",
 *      "passingTD":"40",
 *      "passingInt":"17",
 *      "rushYards":"28",
 *      "rushTD":"1",
 *      "fantasyPoints":"335",
 *      "displayName":"Drew Brees",
 *      "team":"NO"
 * },
 *
 * @author ryan
 */

public class Players extends RealmObject {

    private String displayName;
    private String fantasyPoints;
    private String team;

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