package com.kodilla.testing.shape;

public class Square implements Shape{
    @Override
    public void getShapeName() {
        System.out.println("jestem kwadratem");
    }

    @Override
    public void getField() {
        System.out.println("Pole wynosi 30");
    }
}
