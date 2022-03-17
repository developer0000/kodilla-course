package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {



   // private Shape shape;


    public ShapeCollector() {


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


    public Shape getFigure(int n)

    {

        if  (n< lista.size() && n>=0) {

            return lista.get(n);
        }
        return  null;
    }


    public void showFigures()
    {
        System.out.println("lista to"+lista.toString());

    }


    public int getSize()

    {


        return  lista.size();
    }




    @Override
    public String toString() {
        return "ShapeCollector{" +
                "lista=" + lista +
                '}';
    }




}
