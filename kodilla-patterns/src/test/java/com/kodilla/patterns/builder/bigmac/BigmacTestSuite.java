package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Sesame bun")
                .burgers(2)
                .sauce("Barbecue")
                .ingredient("Cheese")
                .ingredient("Onion")
                .ingredient("Lettuce")
                .ingredient("Bacon")
                .ingredient("Mushrooms")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals("Sesame bun", bigmac.getBun());
        Assert.assertEquals(2, bigmac.getBurgers());
        Assert.assertEquals("Barbecue", bigmac.getSauce());
        Assert.assertEquals(5, howManyIngredients);
    }
}