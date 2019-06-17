
package com.kodilla.stream.array;

import java.util.stream.IntStream;

public class AverageNumbers implements ArrayOperations {

    public double getAverage(int[]numbers) {
        IntStream.range(0, numbers.length)
                .forEach(e -> System.out.println(numbers[e]));

        return IntStream.range(0, numbers.length)
                .map(e -> numbers[e])
                .average().getAsDouble();

    }

}
