package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given, When
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
        //Then
        List<String> ingredients = new ArrayList<>();

        ingredients.add("Cheese");
        ingredients.add("Onion");
        ingredients.add("Lettuce");
        ingredients.add("Bacon");
        ingredients.add("Mushrooms");

        Assert.assertEquals("Sesame bun", bigmac.getBun());
        Assert.assertEquals(2, bigmac.getBurgers());
        Assert.assertEquals("Barbecue", bigmac.getSauce());
        Assert.assertEquals(5, bigmac.getIngredients().size());
        Assert.assertEquals(ingredients, bigmac.getIngredients());
    }
}