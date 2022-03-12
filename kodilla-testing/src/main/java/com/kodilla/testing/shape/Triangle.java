package com.kodilla.testing.shape;

public class Triangle implements Shape{
    @Override
    public void getShapeName() {
        System.out.println("jestem trojkatem");
    }

    @Override
    public void getField() {
        System.out.println("Pole wynosi 50");

    }
}
