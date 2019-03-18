package com.kodilla.testing.collection;
import java.util.ArrayList;

public class OddNumbersExterminator {

    public static ArrayList<Integer> exterminate (ArrayList<Integer> numbers) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (Integer elementsOfList: numbers) {
            if(elementsOfList %2 == 0) {
                evenNumbers.add(elementsOfList);
            }
        }
        return evenNumbers;
    }
}
