
package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.library.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import com.kodilla.testing.forum.statistics.CalculateAdvStatistics;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;

public class TestCalculateStatistics {

    private List<Integer> generateListOfUsers(int usersQuantity) {
        List<Integer> listOfUsers= new ArrayList<>();
        for(int n = 1; n <= usersQuantity; n++){
            usersQuantity++;
            listOfUsers.add(usersQuantity);
        }
        return listOfUsers;
    }

        @Test
        public void testNumberOfPostsIsNull() {
            //Given
            Statistics statisticsMock = mock(Statistics.class);
            CalculateAdvStatistics calculateStatistics = new CalculateAdvStatistics();
            List<String> listOfUserNames = new ArrayList<>();
            listOfUserNames.add("gdrg");

            when(statisticsMock.postsCount()).thenReturn(0);
            when(statisticsMock.userNames()).thenReturn(listOfUserNames);
            when(statisticsMock.commentsCount()).thenReturn(0);

            //When
            calculateStatistics.calculateAdvStatistics(statisticsMock);
            int zeroPosts = calculateStatistics.postsCount();

            //Then
            Assert.assertEquals(0, zeroPosts);
        }

        @Test
         public void testNumberOfPostsIsOneThousand() {
              //Given
              Statistics statisticsMock = mock(Statistics.class);
              CalculateAdvStatistics calculateStatistics = new CalculateAdvStatistics();
              List<String> listOfUserNames = new ArrayList<>();
              listOfUserNames.add("gdrg");

              when(statisticsMock.postsCount()).thenReturn(1000);
              when(statisticsMock.userNames()).thenReturn(listOfUserNames);
              when(statisticsMock.commentsCount()).thenReturn(1000);

              //When
              calculateStatistics.calculateAdvStatistics(statisticsMock);
              int oneThousandPosts = calculateStatistics.postsCount();

              //Then
              Assert.assertEquals(1000, oneThousandPosts);
    }

    @Test
    public void testNumberOfCommentsIsNull() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateAdvStatistics calculateStatistics = new CalculateAdvStatistics();
        List<String> listOfUserNames = new ArrayList<>();
        listOfUserNames.add("gdrg");

        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.userNames()).thenReturn(listOfUserNames);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int zeroComments = calculateStatistics.postsCount();

        //Then
        Assert.assertEquals(0, zeroComments);
    }

    @Test
    public void testNumberOfCommentsIsLessThanNumberOfPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateAdvStatistics calculateStatistics = new CalculateAdvStatistics();
        List<String> listOfUserNames = new ArrayList<>();
        listOfUserNames.add("gdrg");

        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.userNames()).thenReturn(listOfUserNames);
        when(statisticsMock.commentsCount()).thenReturn(100);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(1000, calculateStatistics.postsCount());
        Assert.assertEquals(100, calculateStatistics.commentsCount());
        Assert.assertEquals(1, calculateStatistics.getNumberOfUsers());
        Assert.assertEquals(0.1, calculateStatistics.getAverageNumberOfCommentsPerPost(), 0.01);
        Assert.assertEquals(100, calculateStatistics.getAverageNumberOfCommentsPerUser() , 0.01);
        Assert.assertEquals(1000, calculateStatistics.getAveragePostsPerUser(), 0.01);

    }


}
