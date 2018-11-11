package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(1, "user1", 'M', LocalDate.of(1990, 3, 5),123));
        forumUserList.add(new ForumUser(2, "user2", 'F', LocalDate.of(1960, 9, 2),150));
        forumUserList.add(new ForumUser(3, "user3", 'M', LocalDate.of(1954, 4, 15),12));
        forumUserList.add(new ForumUser(4, "user4", 'M', LocalDate.of(2011, 12, 25),0));
        forumUserList.add(new ForumUser(5, "userA", 'M', LocalDate.of(1992, 2, 12),301));
        forumUserList.add(new ForumUser(6, "userB", 'F', LocalDate.of(2004, 8, 1),170));
        forumUserList.add(new ForumUser(7, "userC", 'F', LocalDate.of(2003, 11, 16),54));
        forumUserList.add(new ForumUser(8, "userD", 'M', LocalDate.of(1989, 10, 10),0));
    }
    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUserList);
    }
}