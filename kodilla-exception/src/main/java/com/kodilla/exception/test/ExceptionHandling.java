
package com.kodilla.exception.test;

public class ExceptionHandling  {
    public static void main(String[] args) throws Exception {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(2, 3);
        } catch (Exception e) {
            throw new Exception();
        } finally {
            System.out.println("We have ");
        }

    }

}
