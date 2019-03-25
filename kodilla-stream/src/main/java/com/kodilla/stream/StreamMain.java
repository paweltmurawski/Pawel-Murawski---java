package com.kodilla.stream;

//import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.com.kodilla.stream.reference.FunctionalCalculator;
import com.kodilla.stream.person.People;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
/*
        System.out.println("7.1 task");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify()
*/

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n", "<<", ">>"));

        System.out.println(theResultStringOfBooks);

        Forum theForum = new Forum();
        theForum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'F')

                .filter(forumUser -> forumUser.getNumberOfPosts() > 0)
                .forEach(System.out::println);


        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Some nice text", (textToBeautify) -> textToBeautify.toUpperCase());
        poemBeautifier.beautify("Some nice text", (textToBeautify) -> "ABC" + textToBeautify + "ABC");
        poemBeautifier.beautify("Some nice text", (textToBeautify) -> textToBeautify.toLowerCase());
        poemBeautifier.beautify("Some nice text", (textToBeautify) -> textToBeautify + "!");


        /*
        Map<int, ForumUser> theResultMapOfForumUsers = theForum.getUserList().stream()
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));
        theResultMapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
*/
    }
}
