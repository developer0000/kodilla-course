package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {

    private String nameCoutry;
    private BigDecimal peopleQuantity;

    public void Country(String nameCoutry, BigDecimal peopleQuantity){
        this.nameCoutry=nameCoutry;
        this.peopleQuantity=peopleQuantity;

    }


    BigDecimal getPeopleQuantity()
    {

        return peopleQuantity;
    }



}
