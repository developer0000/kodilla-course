package com.kodilla.stream.beautifier;

public class PoemBeautifier implements PoemDecorator{

    public void beautify(String tekst,PoemDecorator decorator){
        decorator.decorate("ABC");

    }

    @Override
    public void decorate(String tekst) {
        System.out.print("***************** +" +tekst);
    }
}
