package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {



    private Shape shape;


    public ShapeCollector(Shape shape) {

        this.shape = shape;
    }


    List<Shape> lista = new ArrayList<>();



    public void addFigure(Shape shape)
    {


        lista.add(shape);

    }
    public void removeFigure(Shape shape)

    {


        lista.remove(shape);
    }


    public void getFigure(int n)

    {

        lista.get(n);
    }


    public void showFigures()
    {
        System.out.println("lista to"+lista.toString());

    }

    @Override
    public String toString() {
        return "ShapeCollector{" +
                "lista=" + lista +
                '}';
    }




}
