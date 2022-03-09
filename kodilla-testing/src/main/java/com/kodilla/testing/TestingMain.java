package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

import java.math.BigInteger;

public class TestingMain {

    public static void main(String[] args) {
        int minimum = -2147483648;
        int maximum = 2147483647;
        Calculator calculator = new Calculator();
        int resultAdd = calculator.add(2147483100, 1000);

        if ((resultAdd !=-11111111) && (resultAdd<maximum) && (resultAdd>minimum)) {
            System.out.println(" SUMA: zakres liczb prawidlowy: "+resultAdd);

        }
            else
        {
            System.out.println(" SUMA: blad wprowadzonych danych, "+"suma nie  moze przekroczyc wartosci granicznej zminnej typu int 2147483647");

        }


        Calculator calculator2 = new Calculator();
        int resultSubtract=calculator2.subtract(10,-2147483648);
        if ((resultSubtract !=-11111111) && (resultSubtract<maximum) && (resultSubtract>minimum)) {
            System.out.println(" ");
            System.out.println(" ROZNICA: zakres liczb prawidlowy: " + resultSubtract);
        }

        else
        {
            System.out.println(" ROZNICA: blad wprowadzonych danych, "+"roznica nie  moze przekroczyc wartosci granicznej zminnej typu int -2147483648");

        }

    }
}
