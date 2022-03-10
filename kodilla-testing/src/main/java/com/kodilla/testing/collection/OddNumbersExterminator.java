package com.kodilla.testing.collection;
import  java.util.*;
public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> nowa = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {

            Integer o = numbers.get(i);
            if (o % 2 == 0) {
                nowa.add(o);
            }


        }
        if (nowa.size()>0) {
            return nowa;
        }
        else return nowa=null;

    }


}

