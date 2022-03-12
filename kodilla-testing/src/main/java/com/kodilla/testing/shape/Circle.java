package com.kodilla.testing.shape;

public class Circle implements Shape{
    @Override
    public void getShapeName() {
        System.out.println("jestem trojkarem");
    }

    @Override
    public void getField() {
        System.out.println("Pole wynosi 20");


    }
}
