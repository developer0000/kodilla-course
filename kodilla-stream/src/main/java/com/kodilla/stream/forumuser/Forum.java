package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    public static List <ForumUser> getUserList(){
        List<ForumUser> lista = new ArrayList<>();

        lista.add(new ForumUser(1,"Joe",'M',LocalDate.of(2000,2,5) ,2 ));
        lista.add(new ForumUser(2,"Monika",'F',LocalDate.of(2010,3,1) ,5 ));
        lista.add(new ForumUser(3,"Janek",'F',LocalDate.of(2002,3,1) ,9 ));
        lista.add(new ForumUser(4,"Darek",'F',LocalDate.of(2001,3,1) ,1 ));
        lista.add(new ForumUser(5,"Krzysztof",'F',LocalDate.of(1982,3,1) ,7 ));
        lista.add(new ForumUser(6,"Piotr",'F',LocalDate.of(1988,3,1) ,15 ));
        lista.add(new ForumUser(7,"Ola",'F',LocalDate.of(1991,3,1) ,13 ));
        lista.add(new ForumUser(8,"Kaia",'F',LocalDate.of(1992,3,1) ,2 ));
        lista.add(new ForumUser(9,"Weronika",'F',LocalDate.of(1999,3,1) ,4 ));



        return new ArrayList<>(lista);

   }

}
