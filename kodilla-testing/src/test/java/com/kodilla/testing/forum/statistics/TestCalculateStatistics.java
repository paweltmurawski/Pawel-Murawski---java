
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

        @Test
        public void testNumberOfPostsIsNull() {
            //Given
            Statistics statisticsMock = mock(Statistics.class);
            CalculateAdvStatistics calculateStatistics = new CalculateAdvStatistics();
            List<String> listOfUserNames = new ArrayList<>();
            listOfUserNames.add("gdrg");

            when(statisticsMock.userNames()).thenReturn(listOfUserNames);
            when(statisticsMock.postsCount()).thenReturn(0);
            when(statisticsMock.commentsCount()).thenReturn(0);

            //When
            calculateStatistics.calculateAdvStatistics(statisticsMock);
            int oneUser = calculateStatistics.getNumberOfUsers();
            int zeroPosts = calculateStatistics.postsCount();
            int noComments = calculateStatistics.commentsCount();
            double numberOfPostsPerUser = calculateStatistics.getAveragePostsPerUser();
            double numberOfCommentsPerUser = calculateStatistics.getAverageNumberOfCommentsPerUser();
            double numberOfCommentsPerPost = calculateStatistics.getAverageNumberOfCommentsPerPost();

            //Then
            Assert.assertEquals(1, oneUser);
            Assert.assertEquals(0, zeroPosts);
            Assert.assertEquals(0, noComments);
            Assert.assertEquals(0, numberOfPostsPerUser, 0.01);
            Assert.assertEquals(0, numberOfCommentsPerUser, 0.01);
            Assert.assertEquals(0, numberOfCommentsPerPost, 0.01);
        }

        @Test
         public void testNumberOfPostsIsOneThousand() {
            //Given
            Statistics statisticsMock = mock(Statistics.class);
            CalculateAdvStatistics calculateStatistics = new CalculateAdvStatistics();
            List<String> listOfUserNames = new ArrayList<>();
            listOfUserNames.add("gdrg");

            when(statisticsMock.userNames()).thenReturn(listOfUserNames);
            when(statisticsMock.postsCount()).thenReturn(1000);
            when(statisticsMock.commentsCount()).thenReturn(0);

            //When
            calculateStatistics.calculateAdvStatistics(statisticsMock);
            int oneUser = calculateStatistics.getNumberOfUsers();
            int oneThousandPosts = calculateStatistics.postsCount();
            int noComments = calculateStatistics.commentsCount();
            double numberOfPostsPerUser = calculateStatistics.getAveragePostsPerUser();
            double numberOfCommentsPerUser = calculateStatistics.getAverageNumberOfCommentsPerUser();
            double numberOfCommentsPerPost = calculateStatistics.getAverageNumberOfCommentsPerPost();

            //Then
            Assert.assertEquals(1, oneUser);
            Assert.assertEquals(1000, oneThousandPosts);
            Assert.assertEquals(0, noComments);
            Assert.assertEquals(1000, numberOfPostsPerUser, 0.01);
            Assert.assertEquals(0, numberOfCommentsPerUser, 0.01);
            Assert.assertEquals(0, numberOfCommentsPerPost, 0.01);
        }


    @Test
    public void testNumberOfCommentsIsNull() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateAdvStatistics calculateStatistics = new CalculateAdvStatistics();
        List<String> listOfUserNames = new ArrayList<>();
        listOfUserNames.add("gdrg");

        when(statisticsMock.userNames()).thenReturn(listOfUserNames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int oneUser = calculateStatistics.getNumberOfUsers();
        int noPosts = calculateStatistics.postsCount();
        int noComments = calculateStatistics.commentsCount();
        double numberOfPostsPerUser = calculateStatistics.getAveragePostsPerUser();
        double numberOfCommentsPerUser = calculateStatistics.getAverageNumberOfCommentsPerUser();
        double numberOfCommentsPerPost = calculateStatistics.getAverageNumberOfCommentsPerPost();

        //Then
        Assert.assertEquals(1, oneUser);
        Assert.assertEquals(0, noPosts);
        Assert.assertEquals(0, noComments);
        Assert.assertEquals(0, numberOfPostsPerUser, 0.01);
        Assert.assertEquals(0, numberOfCommentsPerUser, 0.01);
        Assert.assertEquals(0, numberOfCommentsPerPost, 0.01);
    }

    @Test
    public void testNumberOfCommentsIsLessThanNumberOfPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateAdvStatistics calculateStatistics = new CalculateAdvStatistics();
        List<String> listOfUserNames = new ArrayList<>();
        listOfUserNames.add("gdrg");

        when(statisticsMock.userNames()).thenReturn(listOfUserNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(1, calculateStatistics.getNumberOfUsers());
        Assert.assertEquals(1000, calculateStatistics.postsCount());
        Assert.assertEquals(100, calculateStatistics.commentsCount());
        Assert.assertEquals(1000, calculateStatistics.getAveragePostsPerUser(), 0.01);
        Assert.assertEquals(100, calculateStatistics.getAverageNumberOfCommentsPerUser() , 0.01);
        Assert.assertEquals(0.1, calculateStatistics.getAverageNumberOfCommentsPerPost(), 0.01);

    }

    @Test
    public void testNumberOfCommentsIsMoreThanNumberOfPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateAdvStatistics calculateStatistics = new CalculateAdvStatistics();
        List<String> listOfUserNames = new ArrayList<>();
        listOfUserNames.add("gdrg");

        when(statisticsMock.userNames()).thenReturn(listOfUserNames);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(1, calculateStatistics.getNumberOfUsers());
        Assert.assertEquals(100, calculateStatistics.postsCount());
        Assert.assertEquals(1000, calculateStatistics.commentsCount());
        Assert.assertEquals(100, calculateStatistics.getAveragePostsPerUser(), 0.01);
        Assert.assertEquals(1000, calculateStatistics.getAverageNumberOfCommentsPerUser() , 0.01);
        Assert.assertEquals(10, calculateStatistics.getAverageNumberOfCommentsPerPost(), 0.01);

    }

    @Test
    public void testNumberOfUsersIsNull() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateAdvStatistics calculateStatistics = new CalculateAdvStatistics();
        List<String> listOfUserNames = new ArrayList<>();

        when(statisticsMock.userNames()).thenReturn(listOfUserNames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, calculateStatistics.getNumberOfUsers());
        Assert.assertEquals(0, calculateStatistics.postsCount());
        Assert.assertEquals(0, calculateStatistics.commentsCount());
        Assert.assertEquals(0, calculateStatistics.getAveragePostsPerUser(), 0.01);
        Assert.assertEquals(0, calculateStatistics.getAverageNumberOfCommentsPerUser() , 0.01);
        Assert.assertEquals(0, calculateStatistics.getAverageNumberOfCommentsPerPost(), 0.01);
    }

    @Test
    public void testNumberOfUsersIsOneHundred() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateAdvStatistics calculateStatistics = new CalculateAdvStatistics();
        List<String> listOfUserNames = new ArrayList<>();
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");
        listOfUserNames.add("dg");

        when(statisticsMock.userNames()).thenReturn(listOfUserNames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(100, calculateStatistics.getNumberOfUsers());
        Assert.assertEquals(0, calculateStatistics.postsCount());
        Assert.assertEquals(0, calculateStatistics.commentsCount());
        Assert.assertEquals(0, calculateStatistics.getAveragePostsPerUser(), 0.01);
        Assert.assertEquals(0, calculateStatistics.getAverageNumberOfCommentsPerUser() , 0.01);
        Assert.assertEquals(0, calculateStatistics.getAverageNumberOfCommentsPerPost(), 0.01);
    }


}
