package com.kodilla.testing.forum.statistics;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CalculateStats {

    private Statistics statisticsMock;
    private calculateAdvStatistics calculator;

    @Before
    public void setUp() throws Exception {
        List<String> userNames = new ArrayList<>();
        userNames.add("Mariusz");
        userNames.add("Kacper");

        int postCount = 0;
        int commentsCount = 0;

        statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.userNames()).thenReturn(userNames);

    }

    @Test
    public void TestCalculateAdvStatisticsNoPost() {

        //Given
        calculator = new calculateAdvStatistics();

        //When
        when(statisticsMock.postsCount()).thenReturn(0);
        int postsCount = statisticsMock.postsCount();
        double avgPosts = calculator.getAvgPostUser();

        //Then
        Assert.assertEquals(0, postsCount);
        Assert.assertEquals(0.0, avgPosts, 0);
    }

    @Test
    public void TestCalculateAdvStatistics1000Posts() {
        //Given
        List<String> userNames = new ArrayList<>();
        userNames.add("Mariusz");
        userNames.add("Kacper");

        //When
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.userNames()).thenReturn(userNames);
        int postsCount = statisticsMock.postsCount();
        double avgPosts = postsCount / userNames.size();

        //Then
        Assert.assertEquals(500, avgPosts, 0);
        Assert.assertEquals(postsCount, 1000);

    }

    @Test
    public void TestCalculateAdvStatistics0Comments() {

        //Given
        List<String> userNames = new ArrayList<>();
        userNames.add("Mariusz");
        userNames.add("Kacper");

        //When
        when(statisticsMock.commentsCount()).thenReturn(0);
        int commCount = statisticsMock.commentsCount();
        double avgComm = commCount / userNames.size();
        //Then
        Assert.assertEquals(0, commCount);
        Assert.assertEquals(0, avgComm, 0);
    }

    @Test
    public void TestCalculateAdvStatistics0users() {

        //Given
        List<String> userNames = new ArrayList<>();
        when(statisticsMock.commentsCount()).thenReturn(10);
        //When
        int commCount = statisticsMock.commentsCount();
        double avgComm = userNames.size() / commCount;

        //Then
        Assert.assertEquals(0, avgComm, 0);
        Assert.assertEquals(0, userNames.size());

    }

    @Test
    public void TestCalculateAdvStatistics100users() {

        //Given
        List<String> userNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            userNames.add("abab");
        }

        //When
        int postCount = 10;
        double avgPost = userNames.size() / postCount;

        //Then
        Assert.assertEquals(avgPost, 10, 0);

    }

    @Test
    public void TestCalculateAdvStatisticsPostMore() {

        //Given

        //When
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);
        int postCount = statisticsMock.postsCount();
        int commCount = statisticsMock.commentsCount();

        double avgCommPost = postCount / commCount;

        //Then
        Assert.assertEquals(avgCommPost, 10, 0);


    }

    @Test
    public void TestCalculateAdvStatisticsCommMore() {

        //Given

        //When
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(2000);
        int postCount = statisticsMock.postsCount();
        int commCount = statisticsMock.commentsCount();

        double avgCommPost = commCount / postCount;

        //Then
        Assert.assertEquals(avgCommPost, 20, 0);


    }
}

