package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private int usersQuantity;
    private int postsQuantity;
    private int commentsQuantity;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public int getUsersQuantity() {
        return usersQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    private double calculateAveragePostsPerUser(){
        if(usersQuantity == 0) {
            return 0;
        } else {
            return (double)postsQuantity / usersQuantity;
        }
    }

    private double calculateAverageCommentsPerUser(){
        if(usersQuantity == 0) {
            return 0;
        } else {
            return (double)commentsQuantity / usersQuantity;
        }
    }

    private double calculateAverageCommentsPerPost() {
        if (postsQuantity == 0) {
            return 0;
        } else {
            return (double)commentsQuantity / postsQuantity;
        }
    }

    public void calculateAdvStatistics(Statistics statistics) {
        usersQuantity = statistics.usersNames().size();
        postsQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();
        averagePostsPerUser = calculateAveragePostsPerUser();
        averageCommentsPerUser = calculateAverageCommentsPerUser();
        averageCommentsPerPost = calculateAverageCommentsPerPost();
    }

    public void showStatistics() {
        System.out.println("Forum's user count equals:" + usersQuantity + ".");
        System.out.println("Forum's post count equals:" + postsQuantity + ".");
        System.out.println("Forum's comment count equals:" + commentsQuantity + ".");
        System.out.println("Average posts per user equals:" + averagePostsPerUser + ".");
        System.out.println("Average comments per user equals:" + averageCommentsPerUser + ".");
        System.out.println("Average comments per post equals:" + averageCommentsPerPost + ".");
    }
}
