package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {


    int  identyfikator;
    String nazwaUzytkownika ;
    char plec = 'M';
    //LocalDate dataUrodzenia;
    int dataUrodzenia;
    int iloscOpublikowanychPostow;


    public ForumUser(int identyfikator, String nazwaUzytkownika, char plec, int dataUrodzenia, int iloscOpublikowanychPostow) {
        this.identyfikator = identyfikator;
        this.nazwaUzytkownika = nazwaUzytkownika;
        this.plec = plec;
        this.dataUrodzenia = dataUrodzenia;
        this.iloscOpublikowanychPostow = iloscOpublikowanychPostow;
    }

    public int getIdentyfikator() {
        return identyfikator;
    }
}
