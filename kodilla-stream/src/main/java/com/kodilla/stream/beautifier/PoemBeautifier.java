package com.kodilla.stream.beautifier;

public class PoemBeautifier  {


    public String beautify(String textToBeautify, PoemDecorator decorator){
        decorator.decorate(textToBeautify);

return textToBeautify;
    }


}
