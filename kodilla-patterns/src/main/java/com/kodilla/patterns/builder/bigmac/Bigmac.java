package com.kodilla.patterns.builder.bigmac;

import java.util.*;

public class Bigmac {
    private final String bun;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    public static class BigmacBuilder {
        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            if (bun.equals("Sesame bun") || bun.equals("Plain bun")) {
                this.bun = bun;
            } else {
                throw new IllegalStateException("Please select [Sesame bun] or [Plain bun]");
            }
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            if (burgers == 0) {
                throw new IllegalStateException("Please select at least 1 burger");
            } else {
                this.burgers = burgers;
                return this;
            }
        }

        public BigmacBuilder sauce(String sauce) {
            if (sauce.equals("Standard") || sauce.equals("Thousand islands") || sauce.equals("Barbecue")) {
                this.sauce = sauce;
                return this;
            } else {
                throw new IllegalStateException("Please select one of the available sauces [Standard], [Thousand islands] or [Barbecue]");
            }
        }

        public BigmacBuilder ingredient(String ingredient) {
            Set<String> availableIngredients = new HashSet<>(Arrays.asList("Lettuce", "Onion", "Bacon", "Pickle", "Chili Peppers", "Mushrooms", "Shrimps", "Cheese"));
            if (availableIngredients.contains(ingredient)) {
                ingredients.add(ingredient);
            } else {
                System.out.println("Please select one of the available ingredients [Lettuce], [Onion], [Bacon], [Pickle], [Chili Peppers], [Mushroom], [Shrimps], or [Cheese]");
            }
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    private Bigmac(String bun, int burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}

