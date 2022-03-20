package com.kodilla.stream.person;

public class StreamMain {

    public static void main(String[] args) {
        People.getList().stream()
                .map(n -> n.toUpperCase()) // [1]
                .forEach(System.out::println);                 // [2]
    }
}
