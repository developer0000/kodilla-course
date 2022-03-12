package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

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

    }
    public void showFigures()
    {

    }
}
