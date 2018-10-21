package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    private Statistics statisticsMock;
    private ForumStatistics forumStatistics;
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Launching tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests finished.");
    }

    @Before
    public void beforeTest(){
        statisticsMock = mock(Statistics.class);
        List<String> userList = new ArrayList<>();
        for(int i=0; i<50; i++){
            userList.add("User" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(userList);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(400);
        forumStatistics = new ForumStatistics();
        testCounter++;
        System.out.println("Test #" + testCounter);
    }

    @Test
    public void testCalculateAdvStatisticsCaseZeroPosts(){
        //Given
        when(statisticsMock.postsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, forumStatistics.getPostsQuantity());
        assertEquals(0, forumStatistics.getAveragePostsPerUser(), 0.0);
        assertEquals(0, forumStatistics.getAverageCommentsPerPost(), 0.0);

    }

    @Test
    public void testCalculateAdvStatisticsCaseThousandPosts(){
        //Given
        when(statisticsMock.postsCount()).thenReturn(1000);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(1000, forumStatistics.getPostsQuantity());
        assertEquals(20, forumStatistics.getAveragePostsPerUser(), 0.0);
        assertEquals(0.4, forumStatistics.getAverageCommentsPerPost(), 0.0);
    }

    @Test
    public void testCalculateAdvStatisticsCaseZeroComments(){
        //Given
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, forumStatistics.getCommentsQuantity());
        assertEquals(0, forumStatistics.getAverageCommentsPerUser(), 0.0);
        assertEquals(0, forumStatistics.getAverageCommentsPerPost(), 0.0);
    }

    @Test
    public void testCalculateAdvStatisticsCaseLessCommentsThanPosts(){
        //Given
        when(statisticsMock.commentsCount()).thenReturn(2);
        when(statisticsMock.postsCount()).thenReturn(10);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(10, forumStatistics.getPostsQuantity());
        assertEquals(2, forumStatistics.getCommentsQuantity());
        assertEquals(0.2, forumStatistics.getAveragePostsPerUser(), 0.0);
        assertEquals(0.04, forumStatistics.getAverageCommentsPerUser(), 0.0);
        assertEquals(0.2, forumStatistics.getAverageCommentsPerPost(), 0.0);
    }

    @Test
    public void testCalculateAdvStatisticsCaseMoreCommentsThanPosts(){
        //Given

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(100, forumStatistics.getPostsQuantity());
        assertEquals(400, forumStatistics.getCommentsQuantity());
        assertEquals(2, forumStatistics.getAveragePostsPerUser(), 0.0);
        assertEquals(8, forumStatistics.getAverageCommentsPerUser(), 0.0);
        assertEquals(4, forumStatistics.getAverageCommentsPerPost(), 0.0);
    }

    @Test
    public void testCalculateAdvStatisticsCaseZeroUsers(){
        //Given
        List<String> userList = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(userList);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, forumStatistics.getUsersQuantity());
        assertEquals(0, forumStatistics.getAveragePostsPerUser(), 0.0);
        assertEquals(0, forumStatistics.getAverageCommentsPerUser(), 0.0);

    }

    @Test
    public void testCalculateAdvStatisticsCaseHundredUsers(){
        //Given
        List<String> userList = new ArrayList<>();
        for(int i=0; i<100; i++){
            userList.add("User" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(userList);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(100, forumStatistics.getUsersQuantity());
        assertEquals(1, forumStatistics.getAveragePostsPerUser(), 0.0);
        assertEquals(4, forumStatistics.getAverageCommentsPerUser(), 0.0);
    }
}