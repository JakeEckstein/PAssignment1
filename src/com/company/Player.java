package com.company;
import java.util.Random;

public class Player {
    private int value = 0;
    private int rating = 0;
    private int pointsScored = 0;
    Random gen = new Random();

    public Player(int value, int rating) {
        this.value = value;
        this.rating = rating;
    }
    // getter for points scored
    public int getPointsScored() {
        return pointsScored;
    }
    // getter for player value
    public int getValue() {
        return value;
    }
    // setter for player value
    public void setValue(int value) {
        this.value = value;
    }
    // getter for player rating
    public int getRating() {
        return rating;
    }

    //// Series of branches that assign players points based on rating an random selection
    public void setPointsScored() {
        if (rating == 100) {
            pointsScored = gen.nextInt(34 - 30) + 30;
        } else if (rating == 90) {
            pointsScored = gen.nextInt(24 - 20) + 20;
        } else if (rating == 80) {
            pointsScored = gen.nextInt(17 - 15) + 15;
        } else if (rating == 70) {
            pointsScored = gen.nextInt(14 - 10) + 10;
        } else if (rating == 60) {
            pointsScored = gen.nextInt(6 - 4) + 4;
        }

    }
}

