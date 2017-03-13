package com.ryansapps.ontheball.Model;

import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

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

    @PrimaryKey
    private long playerId;
    private String displayName;
    private String fantasyPoints;
    private String team;

    public long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(long playerId) {
        this.playerId = playerId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getFantasyPoints() {
        return fantasyPoints;
    }

    public void setFantasyPoints(String fantasyPoints) {
        this.fantasyPoints = fantasyPoints;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }





}