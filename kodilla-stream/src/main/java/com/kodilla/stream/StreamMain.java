package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.SaySomething;
import com.kodilla.stream.book.BookDirectory;
public class StreamMain {


        public static void main(String[] args) {
            //PoemDecorator decorator = new PoemBeautifier();
//            String kot= decorator.decorate("abc");
//            System.out.println(kot);
            PoemBeautifier upiekszacz = new PoemBeautifier();
            upiekszacz.beautify("abc", tekst ->  tekst+":)");

            upiekszacz.beautify("abc", tekst ->  tekst.toUpperCase()+":)");

            upiekszacz.beautify("abc", tekst ->  "zzz "+tekst+" zzz");
        }
}





