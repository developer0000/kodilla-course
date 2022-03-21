package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    public static List <ForumUser> getUserList(){
        List<ForumUser> lista = new ArrayList<>();

        lista.add(new ForumUser(1,"Joe",'M',2007-12-03,2));
        lista.add(new ForumUser(2,"Jan",'M',2001-12-03,3));
        lista.add(new ForumUser(2,"Joanna",'F',2009-12-03,4));



        return new ArrayList<>(lista);

   }

}
