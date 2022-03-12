package com.kodilla.testing.shape;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {

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


    @DisplayName("addFigure")
    @Test
    void testAddFigure() {

        List<Shape> lista = new ArrayList<>();
        Circle kolo= new Circle();

        lista.add(kolo) ;
        int i=lista.size();

        Assertions.assertEquals(1,i);

    }

    @DisplayName("removeFigure")
    @Test
    void testRemoveFigure() {

        List<Shape> lista = new ArrayList<>();
        Circle kolo= new Circle();
        Triangle trojkat = new Triangle();
        lista.add(kolo) ;
        lista.add(trojkat);
        int i= lista.size();
        lista.remove(kolo) ;
        int j= lista.size();

        Assertions.assertFalse(j==i);

    }


}
