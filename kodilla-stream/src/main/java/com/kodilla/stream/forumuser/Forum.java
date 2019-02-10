package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1, "kacper", 'm', 1991, 3, 23, 10));
        userList.add(new ForumUser(2, "mariusz", 'm', 1993, 5, 11, 20));
        userList.add(new ForumUser(3, "kasia", 'f', 1995, 7, 13, 50));
        userList.add(new ForumUser(4, "aleksandra", 'f', 1997, 9, 21, 0));
        userList.add(new ForumUser(5, "rafal", 'm', 1999, 12, 31, 100));

    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
