/*
package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import com.kodilla.testing.forum.statistics.CalculateStatistics;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestCalculateStatistics {
        @Test
        public void testNumberOfPostsIsNull() {
            //Given
            Statistics statisticsMock = mock(Statistics.class);
            List<String> usersList = new ArrayList<>();
            usersList.add("hbhh");
            usersList.add("hbhgvh");
            usersList.add("hbhhfc");
            usersList.add("hbhbhh");
            usersList.add("hbhgvgh");

            int numberOfPosts =0;

            when(statisticsMock.postsCount()).thenReturn(numberOfPosts);

            CalculateAdvStatistics calculateStatistics = new CalculateAdvStatistics(statisticsMock);

            //When
            int zeroPosts = statisticsMock.postsCount();

            //Then
            Assert.assertEquals(0, zeroPosts);
        }

}
*/