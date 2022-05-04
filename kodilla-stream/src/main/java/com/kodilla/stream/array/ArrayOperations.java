package com.kodilla.stream.array;
import java.util.*;
import java.util.stream.IntStream;

public interface ArrayOperations {

   static double getAverage(int[] numbers){


       IntStream.range(0, numbers.length)
              .forEach((x)->{
                   String tmp = " "+x+" ";
                           System.out.print (tmp);
              });





      return IntStream.range(0, numbers.length)
               .average().getAsDouble();




   }
}
