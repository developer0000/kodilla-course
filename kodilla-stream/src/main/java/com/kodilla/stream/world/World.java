package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {


    BigDecimal getPeopleQuantity() {

                 BigDecimal totalPeople = list.stream()
                         .flatMap(continent -> continent.getlistCountry().stream()).map(country -> country.getPeopleQuantity())
                         .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));






        return totalPeople;
    }


    List<Continent> list = new ArrayList<>();

    public void addContinent (Continent continent){

        list.add(continent);
    }





}
