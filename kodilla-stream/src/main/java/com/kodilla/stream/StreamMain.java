package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println("Decorating texts with lambdas");
        System.out.println(poemBeautifier.beautify("aaaaa", text -> text.toUpperCase()));
        System.out.println(poemBeautifier.beautify("AAAAA", text -> text.toLowerCase()));
        System.out.println(poemBeautifier.beautify("aaaaa", text -> text.substring(0, 3)));
        System.out.println(poemBeautifier.beautify("aaaaa", text -> "ABC" + " " + text + " " + "abc"));
        System.out.println(poemBeautifier.beautify("aaaaa", text -> ">oOo<" + " " + text + " " + ">oOo<"));
        System.out.println(poemBeautifier.beautify("aaaaa", text -> "vIXIv" + " " + text + " " + "vIXIv"));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}