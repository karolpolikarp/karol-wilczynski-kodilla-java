package com.kodilla.rps;

import java.util.Random;
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
            String userInput = scanner.nextLine();
            inputValidator(userInput);
        }
    }

    public void round(int computerMove, int playerMove) {
        if (playerMove == computerMove) {
            System.out.println("Draw! Both Computer and " + playerName + " chose the same figure.");
        }
        if (playerMove == 3 && computerMove == 2) {
            playerWins++;
            System.out.println("Computer chose Paper whilst " + playerName + " chose Scissors. " + playerName + " won this round.");
        }
        if (playerMove == 1 && computerMove == 3) {
            playerWins++;
            System.out.println("Computer chose Scissors whilst " + playerName + " chose Rock. " + playerName + " won this round.");
        }
        if (playerMove == 2 && computerMove == 1) {
            playerWins++;
            System.out.println("Computer chose Rock whilst " + playerName + " chose Paper. " + playerName + " won this round.");
        }
        if (playerMove == 2 && computerMove == 3) {
            computerWins++;
            System.out.println("Computer chose Scissors whilst " + playerName + " chose Paper. Computer won this round.");
        }
        if (playerMove == 3 && computerMove == 1) {
            computerWins++;
            System.out.println("Computer chose Rock whilst " + playerName + " chose Scissors. Computer won this round.");
        }
        if (playerMove == 1 && computerMove == 2) {
            computerWins++;
            System.out.println("Computer chose Paper whilst " + playerName + " chose Rock. Computer won this round.");
        }
    }

    private int getComputerInput() {
        Random random = new Random();
        return random.nextInt(3) + 1;
    }

    private void runningGame() {
        System.out.println("Scoreboard: ");
        System.out.println(playerName + ":" + " " + playerWins + " rounds won.");
        System.out.println("Computer: " + computerWins + " rounds won.");
        System.out.println("Press [1] to choose Rock; Press [2] to choose Paper; Press [3] to choose Scissors;");
        System.out.println("Press [X] to end the game; Press [N] to start a new game;");
        System.out.println("Confirm by pressing [ENTER]!");
    }

    private void newGame() {
        System.out.println("Please enter amount of rounds required to win:");
        System.out.println("Confirm by pressing [ENTER]!");
        playerWins = 0;
        computerWins = 0;
        int roundsAmt = scanner.nextInt();
        System.out.println("Good luck " + playerName + "!");
        RpsSettings game = new RpsSettings(playerName, roundsAmt);
        game.game();
    }

    private void inputValidator (String userInput) {
        if  (userInput.equals("1") || userInput.equals("2") || userInput.equals("3")) {

            int userMove = Integer.parseInt(userInput);
            round(getComputerInput(), userMove);

            if (playerWins == roundsAmt || computerWins == roundsAmt) {
                System.out.println("Scoreboard: ");
                System.out.println(playerName + ":" + " " + playerWins + " rounds won.");
                System.out.println("Computer: " + computerWins + " rounds won.");

                if (playerWins > computerWins) {
                    System.out.println("Congratulations, you won!");
                }
                else {
                    System.out.println("You lost, better luck next time!");
                }

                boolean nextGame = false;
                while (!nextGame) {
                    System.out.println("Do you want to start a new game?");
                    System.out.println("Press [Y] to start a new game; Press [N] to exit;");
                    System.out.println("Confirm by pressing [ENTER]!");
                    String yn = scanner.nextLine();
                    if (yn.equals("y")) {
                        newGame();
                        nextGame = true;
                        end = true;
                    } else if (yn.equals("n")) {
                        endOfGame();
                        nextGame = true;
                    } else {
                        System.out.println("Wrong sign!");
                    }
                }
            }
        } else if (userInput.equals("x")) {
            endOfGame();
        } else if (userInput.equals("n")) {
            newGame();
        } else {
            System.out.println("Wrong sign!");
        }
    }
    private void endOfGame() {
        boolean endGame = false;
        while (!endGame ) {
            System.out.println("Are you sure that you want end this game?");
            System.out.println("Press [Y] to exit; Press [N] to continue playing;");
            System.out.println("Confirm by pressing [ENTER]!");
            String yn = scanner.nextLine();
            if (yn.equals("y")) {
                end = true;
                System.out.println("End of the game.");
                endGame  = true;
            } else if (yn.equals("n")) {
                endGame  = true;
            } else {
                System.out.println("Wrong sign!");
            }
        }
    }
}