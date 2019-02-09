package com.kodilla.stream.beautifier;

import com.kodilla.stream.beautifier.*;

public class PoemBeautifier {
    public void beautify(String string, PoemDecorator poemDecorator) {
        String beautyText = poemDecorator.decorate(string);
        System.out.println(beautyText);


    }

}