package com.kodilla.stream.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        AverageNumbers averageNumbers = new AverageNumbers();
        int[] numbers = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        //When
        double averageResult = averageNumbers.getAverage(numbers);
        //Then
        assertEquals(10.5, averageResult, 0);
    }

}