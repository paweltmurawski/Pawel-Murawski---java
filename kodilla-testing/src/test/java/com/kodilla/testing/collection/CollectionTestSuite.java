package com.kodilla.testing.collection;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import com.kodilla.testing.collection.OddNumbersExterminator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Let's start testing");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> isEmpty = new ArrayList<>();
        //When
        ArrayList<Integer> result = OddNumbersExterminator.exterminate(isEmpty);
         //Then
        assertTrue(result.isEmpty());
        assertEquals(isEmpty, result);

    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        ArrayList<Integer> numbersArrayList = new ArrayList<>();
        numbersArrayList.addAll(numbers);
        //When
        ArrayList<Integer> result = OddNumbersExterminator.exterminate(numbersArrayList);
        //Then
        List<Integer> evenNumbers = Arrays.asList(2,4,6,8);
        ArrayList<Integer> evenNumbersArrayList = new ArrayList<>();
        evenNumbersArrayList.addAll(evenNumbers);
        assertEquals(evenNumbersArrayList, result);
    }
    @After
    public void after() {
        System.out.println("We have finished testing");
    }
}

