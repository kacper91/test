package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        BookDirectory theBookDirectory = new BookDirectory();
        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toList());

        System.out.println("# elements: " + theResultListOfBooks.size());
        theResultListOfBooks.stream()
                .forEach(System.out::println);


        System.out.println("\ntest #1");
        Forum forum = new Forum();
        Map<Integer, ForumUser> mapOfUser = forum.getUserList().stream()
                .filter(ForumUser -> ForumUser.getSex() == 'm')
                .filter(ForumUser -> ForumUser.getYearOfBirth() >= 1999)
                .filter(ForumUser -> ForumUser.getPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getId, ForumUser -> ForumUser));

        System.out.println("# elements: " + mapOfUser.size());
        mapOfUser.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}
