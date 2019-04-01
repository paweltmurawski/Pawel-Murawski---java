
package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class CalculateAdvStatistics {
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averagePostsPerUser;
    private double averageNumberOfCommentsPerUser;
    private double averageNumberOfCommentsPerPost;


    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.userNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();

        averagePostsPerUser = numberOfPosts / numberOfUsers;
        averageNumberOfCommentsPerUser = numberOfComments / numberOfUsers;
        averageNumberOfCommentsPerPost = numberOfComments / numberOfPosts;
    }

    public int postsCount() {
        return numberOfPosts;
    }

    public int commentsCount() {
        return numberOfComments;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageNumberOfCommentsPerUser() {
        return averageNumberOfCommentsPerUser;
    }

    public double getAverageNumberOfCommentsPerPost() {
        return averageNumberOfCommentsPerPost;
    }

    public void showStatistics(){
        System.out.println(averagePostsPerUser);
        System.out.println(averageNumberOfCommentsPerUser);
        System.out.println(averageNumberOfCommentsPerPost);
    }
}
