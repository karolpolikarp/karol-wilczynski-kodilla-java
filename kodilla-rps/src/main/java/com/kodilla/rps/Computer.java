package com.kodilla.rps;

import java.util.Random;

public class Computer {

    public int computerMoveGenerator() {
        Random generator = new Random();
        return generator.nextInt(3) + 1;
    }
}