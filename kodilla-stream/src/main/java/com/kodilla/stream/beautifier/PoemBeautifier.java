package com.kodilla.stream.beautifier;

public class PoemBeautifier implements  PoemDecorator {


    public String beautify(PoemDecorator decorator){
        String  a=decorator.decorate("ala");

        return  a;
    }

    @Override
    public String decorate(String tekst) {
        String b=tekst.toUpperCase();

        return  b;
    }


}
