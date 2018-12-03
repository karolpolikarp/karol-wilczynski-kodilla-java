package com.kodilla.rps;

import java.util.Scanner;

public class RpsSettings {

    private String playerName;
    private int roundsAmt;
    private int playerWins = 0;
    private int computerWins = 0;
    private boolean end = false;
    private Scanner scanner = new Scanner(System.in);

    public RpsSettings(String playerName, int roundsAmt) {
        this.playerName = playerName;
        this.roundsAmt = roundsAmt;
    }

    public void game() {
        while (!end) {
            runningGame();
        }
    }

    private void runningGame() {
        System.out.println("Scoreboard: ");
        System.out.println("Computer: " + computerWins + " rounds won.");
        System.out.println(playerName + ":" + " " + playerWins + " rounds won.");
        System.out.println("Press [1] to choose Rock; Press [2] to choose Paper; Press [3] to choose Scissors;");
        System.out.println("Press [X] to end the game; Press [N] to start a new game;");
        System.out.println("Confirm by pressing [ENTER]!");
    }

    private void newGame() {
        System.out.println("Please enter amount of rounds required to win:");
        roundsAmt = scanner.nextInt();
        playerWins = 0;
        computerWins = 0;
    }
}