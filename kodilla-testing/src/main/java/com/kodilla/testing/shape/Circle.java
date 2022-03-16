package com.kodilla.testing.shape;

public class Circle implements Shape{
    @Override
    public void getShapeName() {
        System.out.println("jestem trojkatem");
    }

    @Override
    public void getField() {

        double PI=3.14;
        double promien=10.0;
        double P = PI*(promien*promien);
        System.out.println("Pole wynosi "+P);


    }
}
