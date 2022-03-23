package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {


    int  identyfikator;
    String nazwaUzytkownika ;
    char plec ;
    LocalDate dataUrodzenia;
    //int dataUrodzenia;
    int iloscOpublikowanychPostow;


    public ForumUser(int identyfikator, String nazwaUzytkownika, char plec, LocalDate dataUrodzenia, int iloscOpublikowanychPostow) {
        this.identyfikator = identyfikator;
        this.nazwaUzytkownika = nazwaUzytkownika;
        this.plec = plec;
        this.dataUrodzenia = dataUrodzenia;
        this.iloscOpublikowanychPostow = iloscOpublikowanychPostow;
    }

    public int getIdentyfikator() {
        return identyfikator;
    }

    public String getNazwaUzytkownika() {
        return nazwaUzytkownika;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "identyfikator=" + identyfikator +
                ", nazwaUzytkownika='" + nazwaUzytkownika + '\'' +
                ", plec=" + plec +
                ", dataUrodzenia=" + dataUrodzenia +
                ", iloscOpublikowanychPostow=" + iloscOpublikowanychPostow +
                '}';
    }
}
