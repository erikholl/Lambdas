package be.intecbrussel;

import java.math.BigDecimal;

public class TextPrinter {

    private String sentence;

    public TextPrinter(String sentence) {
        this.sentence = sentence;
    }

    public void printFilteredWords(WordFilter wordFilter) {
        for (String word : sentence.split(" ")) {
            if(wordFilter.isValid(word)) {
                System.out.println(word);
            }
        }
    }

    public void printProcessedWords(ProcessingInterface processingInterface) {
        for (String s : sentence.split(" ")) {
            System.out.println(processingInterface.process(s));
        }
    }

    public void printNumberValues(NumberParser parser) {
        for (String word : sentence.split(" ")) {
            System.out.format("%,d%n", parser.parse(word));
        }
    }

}
