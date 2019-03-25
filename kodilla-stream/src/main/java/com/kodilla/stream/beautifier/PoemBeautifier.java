
package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String textToBeutify,PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(textToBeutify);
        System.out.println("Result equals: " + result);
    }
}
