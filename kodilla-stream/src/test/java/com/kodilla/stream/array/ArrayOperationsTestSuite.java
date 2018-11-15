package com.kodilla.stream.array;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

public class ArrayOperationsTestSuite implements ArrayOperations{
    @Before
    public void before(){
        System.out.println("Test: begin");
    }
    @After
    public void after(){
        System.out.println("Test: end");
    }
    @Test
    public void testGetAverage() {

        //Given
        int[] numbers = new int[10];
        Random random = new Random();
        for (int n=0; n<10; n++) {
            numbers[n] = random.nextInt(10);
        }

        //When
        int numbersSum = 0;
        for(int n=0; n<10; n++) {
            numbersSum = numbersSum + numbers[n];
        }

        double expected = (double)numbersSum / 10;

        //Then
        System.out.println("Displaying numbers map:");
        Assert.assertEquals(expected, ArrayOperations.getAverage(numbers), 0.01);
        System.out.println("Average equals: " + expected);
    }
}