package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();

        //When
        BigDecimal calculatedCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Pizza with tomato sauce and cheese", description);
    }

    @Test
    public void testBasicPizzaOrderTakeAwayBoxGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new TakeAwayBox(theOrder);

        //When
        BigDecimal calculatedCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(17), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderTakeAwayBoxGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new TakeAwayBox(theOrder);

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Pizza with tomato sauce and cheese + packed in a box", description);
    }

    @Test
    public void testBasicPizzaOrderBaconHamMushroomsTakeAwayBoxGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new BaconDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new TakeAwayBox(theOrder);

        //When
        BigDecimal calculatedCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(26), calculatedCost);

    }

    @Test
    public void testBasicPizzaOrderBaconHamMushroomsTakeAwayBoxGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new BaconDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new TakeAwayBox(theOrder);

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Pizza with tomato sauce and cheese " +
                    "+ bacon + ham + mushrooms + packed in a box", description);
    }
}