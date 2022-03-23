package com.kodilla.stream.forumuser;

//import static sun.nio.ch.DatagramChannelImpl.AbstractSelectableChannels.forEach;

import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        Map<Integer,ForumUser> m =   Forum.getUserList().stream()



                .filter(ForumUser-> ForumUser.dataUrodzenia.getYear()<2002)
                .filter(ForumUser->ForumUser.plec=='M')
                .filter(ForumUser->ForumUser.iloscOpublikowanychPostow>1)
                .collect(Collectors.toMap(ForumUser::getIdentyfikator,ForumUser->ForumUser));
                 //m.forEach(System.out::println);
                System.out.println(m);



    }
}




