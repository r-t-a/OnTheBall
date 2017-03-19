package com.ryansapps.ontheball.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

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

public class Players implements Serializable{

    private String playerId;
    @SerializedName("displayName")
    private String displayName;
    @SerializedName("fantasyPoints")
    private String fantasyPoints;
    @SerializedName("team")
    private String team;
    @SerializedName("completions")
    private String completions;
    @SerializedName("attempts")
    private String attempts;
    @SerializedName("passingYards")
    private String passingYards;
    @SerializedName("passingTD")
    private String passingTD;
    @SerializedName("passingInt")
    private String passingInt;
    @SerializedName("rushYards")
    private String rushYards;
    @SerializedName("rushTD")
    private String rushTD;

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
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


    public String getCompletions() {
        return completions;
    }

    public void setCompletions(String completions) {
        this.completions = completions;
    }

    public String getAttempts() {
        return attempts;
    }

    public void setAttempts(String attempts) {
        this.attempts = attempts;
    }

    public String getPassingYards() {
        return passingYards;
    }

    public void setPassingYards(String passingYards) {
        this.passingYards = passingYards;
    }

    public String getPassingTD() {
        return passingTD;
    }

    public void setPassingTD(String passingTD) {
        this.passingTD = passingTD;
    }

    public String getPassingInt() {
        return passingInt;
    }

    public void setPassingInt(String passingInt) {
        this.passingInt = passingInt;
    }

    public String getRushYards() {
        return rushYards;
    }

    public void setRushYards(String rushYards) {
        this.rushYards = rushYards;
    }

    public String getRushTD() {
        return rushTD;
    }

    public void setRushTD(String rushTD) {
        this.rushTD = rushTD;
    }
}