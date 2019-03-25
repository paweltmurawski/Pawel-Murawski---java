package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(1, "Paul", 'M',1990, 6, 23, 0));
        forumUserList.add(new ForumUser(2, "Pete", 'M',1999, 4, 13, 14));
        forumUserList.add(new ForumUser(3, "Caroline", 'F',1992, 2, 3, 22));
        forumUserList.add(new ForumUser(4, "Andy", 'M',2000, 5, 24, 0));
        forumUserList.add(new ForumUser(5, "Josephine", 'F',2006, 7, 11, 0));
        forumUserList.add(new ForumUser(6, "Serena", 'F',1997, 8, 2, 34));
        forumUserList.add(new ForumUser(7, "John", 'M',2004, 2, 28, 16));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUserList);
    }
}
