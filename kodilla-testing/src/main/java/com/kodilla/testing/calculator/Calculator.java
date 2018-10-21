package com.kodilla.testing.calculator;

public class Calculator {
    int resultAdd = 0;
    int resultSubstract = 0;

    public int add(int a, int b) {
        return resultAdd = a + b;
    }

    public int substract(int a, int b) {
        return resultSubstract = a - b;
    }
}