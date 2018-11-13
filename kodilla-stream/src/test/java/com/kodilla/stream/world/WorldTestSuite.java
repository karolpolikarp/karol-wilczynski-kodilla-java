package com.kodilla.stream.world;

import org.junit.*;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Before
    public void before(){
        System.out.println("Test: begin");
    }
    @After
    public void after(){
        System.out.println("Test: end");
    }
    @Test
    public void testGetPeopleQuantity() {
        //Given
        final  Continent europe = new Continent("Europe");
        final  Continent asia = new Continent("Asia");
        final  Continent africa = new Continent("Africa");

        final World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);

        final Country poland = new Country(new BigDecimal(3800000), "Poland");
        final Country france = new Country(new BigDecimal(6700000), "France");
        final Country czech = new Country(new BigDecimal(1100000), "Czech Republic");
        europe.addCountry(poland);
        europe.addCountry(france);
        europe.addCountry(czech);

        final Country china = new Country(new BigDecimal(138600000), "China");
        final Country india = new Country(new BigDecimal(133900000), "India");
        final Country japan = new Country(new BigDecimal(12700000), "Japan");
        asia.addCountry(china);
        asia.addCountry(india);
        asia.addCountry(japan);

        final Country libia = new Country(new BigDecimal(600000), "Libya");
        final Country sudan = new Country(new BigDecimal(4000000), "Sudan");
        final Country tanzania = new Country(new BigDecimal(5600000), "Tanzania");
        africa.addCountry(libia);
        africa.addCountry(sudan);
        africa.addCountry(tanzania);

        //When
        BigDecimal totalPeopleQuantity = world.getPeopleQuantity();

        //Then
        BigDecimal totalPopulation = new BigDecimal(307000000);
        Assert.assertEquals(totalPopulation, totalPeopleQuantity);
    }
}