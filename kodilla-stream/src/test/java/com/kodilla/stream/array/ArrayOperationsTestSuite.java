package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {

    @DisplayName("Test sredniej")
    @Test
    void GetAverage(){
        //given
        int [] tablica  = new int[40];
        for (int i=0;i<tablica.length;i++){
            tablica[i]=i;
        }

        //when
        Double tmp=ArrayOperations.getAverage(tablica);

        System.out.println();
        System.out.println(tmp);


        //then
        Assertions.assertEquals(19.5,tmp);



    }






}



