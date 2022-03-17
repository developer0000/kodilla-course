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


        ShapeCollector shape=new ShapeCollector();
        //List<Shape> lista = new ArrayList<>();
        Circle kolo= new Circle();

        shape.addFigure(kolo); ;
        int k =shape.getSize();
        Assertions.assertEquals(1,k);

    }

    @DisplayName("removeFigure")
    @Test
    void testRemoveFigure() {
        ShapeCollector shape=new ShapeCollector();

        Circle kolo= new Circle();
        Circle kolo1= new Circle();
        shape.addFigure(kolo); ;
        shape.addFigure(kolo1);


        int i= shape.getSize();
        Assertions.assertEquals(2,i);
        shape.removeFigure(kolo); ;
        int j= shape.getSize();

        Assertions.assertEquals(1,j);

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
        ShapeCollector shape = new ShapeCollector();
        Circle kolo = new Circle();
        Circle kolo2 = new Circle();
        shape.addFigure(kolo);
        shape.addFigure(kolo2);
        Shape i = shape.getFigure(1);

        Assertions.assertNotNull(i);

    }
        @DisplayName("getFigures-1")
        @Test
        void testgetFigureminus() {
            ShapeCollector shape=new ShapeCollector();
            Circle kolo = new Circle();
            Circle kolo2 = new Circle();
            shape.addFigure(kolo);
            shape.addFigure(kolo2);
            Shape i=shape.getFigure(-1);

            Assertions.assertNull(i);




    }
}
