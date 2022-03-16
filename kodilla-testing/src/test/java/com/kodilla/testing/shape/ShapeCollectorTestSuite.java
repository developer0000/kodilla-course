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


    @DisplayName("showFigure")
    @Test
    void testShowFigure() {
        List<Shape> lista = new ArrayList<>();
        Circle kolo = new Circle();
        Triangle trojkat = new Triangle();
        lista.add(kolo);
        lista.add(trojkat);
        //System.out.println(lista);
        Assertions.assertEquals(2,lista.size());
    }


    @DisplayName("getFigures")
    @Test
    void testgetFigure() {
        List<Shape> lista = new ArrayList<>();
        Circle kolo = new Circle();
        Circle kolo2 = new Circle();
        lista.add(kolo);
        //lista.add(kolo2);

        Assertions.assertEquals(1,lista.get(0));






    }
}
