package com.kodilla.testing.calculator;

public class Calculator {

   public  int  add(int a , int b)
    {

        int suma=0;
        suma=a+b;
        //System.out.println(suma);
        if (suma<a || suma<b) {
            //System.out.println("blad");
            return -11111111;
        }

        return suma;
    }

  public  int  subtract(int a , int b)
    {
        int roznica=a-=b;
        if (roznica>a || roznica>b) {
            //System.out.println("blad");
            return -11111111;
        }
        return roznica;
    }

}
