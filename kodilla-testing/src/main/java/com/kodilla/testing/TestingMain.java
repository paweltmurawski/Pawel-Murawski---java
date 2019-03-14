package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }


        // Calculator test
        Calculator calculate = new Calculator();

        int addingResult = calculate.addResult(10,8);
        int subtractingResult = calculate.subtractResult(10,8);

        if(addingResult == 18) {
            System.out.println("It's the right result");
        } else {
            System.out.println("We have error");
        }

        if(subtractingResult == 2) {
            System.out.println("It's the right result");
        } else {
            System.out.println("We have error");
        }
    }

}
