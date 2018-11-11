package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.person.People;

import java.util.Map;
import java.util.stream.Collectors;
import java.time.LocalDate;

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

        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);

        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n", "<<", ">>"));

        System.out.println(theResultStringOfBooks);

        System.out.println(" ");

        Forum forum = new Forum();
        Map<Integer, ForumUser> mapOfForumUsers = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getUserSex()=='M')
                .filter(forumUser -> forumUser.getUserDateOfBirth().isBefore(LocalDate.now().minusYears(20)))
                .filter(forumUser -> forumUser.getUserPostCount() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        mapOfForumUsers.entrySet().stream()
                .map(entry -> "UserId: " + entry.getKey() + ": UserData: " + entry.getValue())
                .forEach(System.out::println);
    }
}