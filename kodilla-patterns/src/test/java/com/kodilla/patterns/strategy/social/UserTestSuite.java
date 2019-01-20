package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User user0 = new Millenials("user0");
        User user1 = new YGeneration("user1");
        User user2 = new ZGeneration("user2");
        //When
        String user0Preference = user0.sharePost();
        String user1Preference = user1.sharePost();
        String user2Preference = user2.sharePost();
        //Then
        Assert.assertEquals("Facebook", user0Preference);
        System.out.println("user0 shares through " + user0Preference);
        Assert.assertEquals("Twitter", user1Preference);
        System.out.println("user1 shares through " + user1Preference);
        Assert.assertEquals("Snapchat", user2Preference);
        System.out.println("user2 shares through " + user2Preference);
    }
    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User user0 = new Millenials("user0");
        //When
        String user0Preference = user0.sharePost();
        System.out.println("user0 uses " + user0Preference);
        user0.setSocialPublisher(new TwitterPublisher());
        user0Preference = user0.sharePost();
        System.out.println("user0 grew up and began to use " + user0Preference);
        //Then
        Assert.assertEquals("Twitter", user0Preference);
    }
}
