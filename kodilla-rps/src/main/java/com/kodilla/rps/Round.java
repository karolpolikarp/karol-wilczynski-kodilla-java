package com.kodilla.rps;

public class Round {

    private String playerName;
    public int playerWins = 0;
    public int computerWins = 0;

    public void round(int computerMove, int playerMove) {

        if (playerMove == computerMove) {
            System.out.println("Draw!");
        }
        if (playerMove == 1 && computerMove == 2) {
            computerWins++;
            System.out.println("Computer chose paper whilst " + playerName + " chose rock. Computer won this round.");
        }
        if (playerMove == 1 && computerMove == 3) {
            playerWins++;
            System.out.println("Computer chose scissors whilst " + playerName + " chose rock. " + playerName + " won this round.");
        }
        if (playerMove == 2 && computerMove == 1) {
            playerWins++;
            System.out.println("Computer chose rock whilst " + playerName + " chose paper. " + playerName + " won this round.");
        }
        if (playerMove == 2 && computerMove == 3) {
            computerWins++;
            System.out.println("Computer chose scissors whilst " + playerName + " chose paper. Computer won this round.");
        }
        if (playerMove == 3 && computerMove == 1) {
            computerWins++;
            System.out.println("Computer chose rock whilst " + playerName + " chose scissors. Computer won this round.");
        }
        if (playerMove == 3 && computerMove == 2) {
            playerWins++;
            System.out.println("Computer chose paper whilst " + playerName + " chose scissors. " + playerName + " won this round.");
        }
    }
}
