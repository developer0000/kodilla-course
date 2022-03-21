package com.kodilla.stream.forumuser;

public class StreamMain {

    public static void main(String[] args) {

        Forum.getUserList().stream()                         // [1]
                .forEach(System.out::println);

    }
}
