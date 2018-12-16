package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Rock-paper-scissors!");
        System.out.println("Please enter your name to continue:");
        System.out.println("Confirm by pressing [ENTER]!");
        String playerName = scanner.nextLine();
        System.out.println("Welcome " + playerName + "!");
        System.out.println("Please enter amount of rounds required to win:");
        System.out.println("Confirm by pressing [ENTER]!");
        int roundsAmt = scanner.nextInt();
        System.out.println("Good luck " + playerName + "!");

        RpsSettings game = new RpsSettings(playerName, roundsAmt);
        game.game();
    }
}