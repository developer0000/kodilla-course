package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.SaySomething;
import com.kodilla.stream.book.BookDirectory;
public class StreamMain {


        public static void main(String[] args) {

            String tekst= "Ala ma kota";
            PoemBeautifier upiekszacz = new PoemBeautifier();






            upiekszacz.beautify(cos-> tekst+"ABC");
        }
}
