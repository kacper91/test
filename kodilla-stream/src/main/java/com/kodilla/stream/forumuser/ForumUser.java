package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int id;
    private final String username;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int posts;

    public ForumUser(final int id, final String username,
                     final char sex, final int yearOfBirth, final int monthOfBirth, final int dayOfBirth,
                     final int posts) {

        this.id = id;
        this.username = username;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.posts = posts;


    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPosts() {
        return posts;
    }

    public int getYearOfBirth() {
        return dateOfBirth.getYear();
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", posts=" + posts +
                '}';
    }
}
