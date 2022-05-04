package com.kodilla.stream.world;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.*;

public class Continent {

     private String name;

    public Continent(String name) {
        this.name = name;
    }

    public List<Country> getlistCountry ()
    {

        return lista;
    }

  private  List<Country> lista = new ArrayList<>();

    public void addCountry( Country country){

        lista.add(country);
    }





}
