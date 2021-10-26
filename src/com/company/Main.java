package com.company;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.pickTeam();
        game.printInstructions();;
        game.pickPlayers();
        game.displayTeam();
        game.randomizeTeams();
        game.gameSimulation();
        game.printRecord();
    }
}


