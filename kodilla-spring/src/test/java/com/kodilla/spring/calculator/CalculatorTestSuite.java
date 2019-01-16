package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double addResult = calculator.add(5, 10);
        double subResult = calculator.sub(7, 2);
        double mulResult = calculator.mul(12, 12);
        double divResult = calculator.div(30, 5);
        //Then
        Assert.assertEquals(15, addResult, 0.01);
        Assert.assertEquals(5, subResult, 0.01);
        Assert.assertEquals(144, mulResult, 0.01);
        Assert.assertEquals(6, divResult, 0.01);
    }
}