package com.kodilla.testing.collection;
import  com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import  com.kodilla.testing.collection.*;
public class CollectionTestSuite {



    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }


        @DisplayName("Check if list empty")
        @Test
        void testOddNumbersExterminatorEmptyList()
        {
            OddNumbersExterminator obiekt = new OddNumbersExterminator();
            List<Integer> lista = new ArrayList<>();
            lista.add(2);
            lista.add(5);
            lista.add(8);

            if(lista.size()!=0) {
                obiekt.exterminate(lista);
                System.out.println("Lista nie jest pusta");
            }

            else
            {
                System.out.println("Lista jest pusta");
            }

        }
        @DisplayName("CheckIfEven")
        @Test
        void testOddNumbersExterminatorNormalList()
        {
            List<Integer> lista2 = new ArrayList<>();
            List<Integer> wynik = new ArrayList<>();
            lista2.add(1);
            lista2.add(3);
            lista2.add(7);
            lista2.add(10);
            OddNumbersExterminator obiekt2 = new OddNumbersExterminator();
            wynik=obiekt2.exterminate(lista2);
            System.out.println("parzyste liczby to: "+wynik);
        }


}

