package com.kodilla.stream.forumuser;

//import static sun.nio.ch.DatagramChannelImpl.AbstractSelectableChannels.forEach;

public class StreamMain {

    public static void main(String[] args) {

        Forum.getUserList().stream()
                .filter(ForumUser-> ForumUser.dataUrodzenia >2005);
                .filter(ForumUser-> ForumUser.plec ='M');
                .filter(ForumUser-> ForumUser.iloscPostow >1);
                .collect(Collectors.toMap(ForumUser::getIdentyfikator, ForumUser -> ForumUser));
                .forEach(System.out::println);

    }
}




