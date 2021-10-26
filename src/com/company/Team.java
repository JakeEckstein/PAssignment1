package com.company;
import java.util.ArrayList;
public class Team {
    private String teamName;
    public ArrayList<Position> players = new ArrayList<>();
    private int capSpace = 100;
    private int totalPoints = 0;
    private int wins = 0;
    private int losses = 0;

    // method for taking on team name
    public Team(String teamName) {
        this.teamName = teamName;
    }
    // getter for team name
    public String getName(){
        return teamName;
    }
    // setter for total points taking on points
    public void setTotalPoints(int points) {
        totalPoints += points;
    }
    // method for resetting user team points after every game
    public void clearPoints() {
        totalPoints = 0;
    }
    // getter for cap space
    public int getCapSpace() {
        return capSpace;
    }
    // setter for cap space to subtract player value after player player has been added to usersTeam
    public int setCapSpace(int playerValue) {
        return capSpace -= playerValue;
    }
    //method to add the player value to user teams cap space
    public void addCapSpace(int playerValue) {
        capSpace += playerValue;
    }
    // method for calculating wins
    public int getWins() {
        return wins;
    }
    // setter for calculating wins
    public void setWins(int wins) {
        this.wins += wins;
    }
    // getter for calculating losses
    public int getLosses() {
        return losses;
    }
    // setter for adding losses for each loss
    public void setLosses(int losses) {
        this.losses += losses;
    }
    // getter for total points
    public int getTotalPoints() {
        return totalPoints;
    }
}
