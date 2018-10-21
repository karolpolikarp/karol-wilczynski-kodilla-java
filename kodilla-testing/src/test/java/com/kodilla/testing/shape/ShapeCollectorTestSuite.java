package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Launching tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Test #" + testCounter);
    }

    @Test
    public void testAddFigure() {

        //given
        Shape square = new Square(2);
        ShapeCollector shapeCollector = new ShapeCollector();

        //when
        shapeCollector.addFigure(square);

        //then
        Assert.assertEquals(1, shapeCollector.showFigures());
    }

    @Test
    public void testRemoveFigure() {
        //given
        Shape square = new Square(2);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(square);

        //when
        shapeCollector.removeFigure(square);

        //then
        Assert.assertEquals(0, shapeCollector.showFigures());
    }

    @Test
    public void testGetFigure() {
        //given
        Shape square = new Square(2);
        ShapeCollector shapeCollector = new ShapeCollector();

        //when
        shapeCollector.addFigure(square);

        //then
        Assert.assertTrue(shapeCollector.getFigure(0) instanceof Square);
    }

    @Test
    public void testShowFigure() {
        //given
        Shape square = new Square(2);
        ShapeCollector shapeCollector = new ShapeCollector();

        //when
        shapeCollector.addFigure(square);

        //then
        Assert.assertEquals(square, shapeCollector.getFigure(0));
    }
}
