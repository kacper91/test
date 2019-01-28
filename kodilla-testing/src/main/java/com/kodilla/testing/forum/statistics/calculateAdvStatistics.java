package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class calculateAdvStatistics implements Statistics{

    private int postsCount;
    private int commentsCount;
    private List<String> userNames;
    private int userCount;
    private double avgPostUser;
    private double avgCommUser;
    private double avgCommPost;


    public int userCount(List<String> userNames) {
        return userCount = userNames.size();
    }

    public int postsCount() {
        return postsCount;
    }

    public int commentsCount() {
        return commentsCount;
    }

    public List<String> userNames(){
        return userNames;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        double avgPostUser = postsCount / userCount;
        double avgCommUser = commentsCount / userCount;
        double avgCommPost = commentsCount / postsCount;

    }

    public double getAvgPostUser() {
        return avgPostUser;
    }

    public double getAvgCommUser() {
        return avgCommUser;
    }

    public double getAvgCommPost() {
        return avgCommPost;
    }

    public void showStatistics() {
        System.out.println(getAvgPostUser() + " " + getAvgCommPost() + " " +getAvgCommUser());


    }
}
