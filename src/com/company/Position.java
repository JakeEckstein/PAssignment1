package com.company;

public class Position extends Player {
    private String position = null;
    private String name = null;

    public Position (int value, int rating, String position, String name) {
        super (value, rating);
        this.position = position;
        this.name = name;
    }
    // getter for the name
    public String getName() {
        return name;
    }
    // getter for the position
    public String getPosition() {
        return position;
    }
}
