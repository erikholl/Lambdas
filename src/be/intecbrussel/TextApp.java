package be.intecbrussel;

import java.math.BigDecimal;

public class TextApp {
    public static void main(String[] args) {

        TextPrinter printer = new TextPrinter("It is suggested that a system " +
                                                      "of chemical " +
                                                      "substances, called " +
                                                      "morphogens, reacting " +
                                                      "together and diffusing" +
                                                      " through a tissue, is " +
                                                      "adequate to account " +
                                                      "for the main phenomena" +
                                                      " of morphogenesis. " +
                                                      "(quote Alan Turing)");

        // use filter as anonymous nested class:
//        printer.printFilteredWords(new WordFilter() {
//            @Override
//            public boolean isValid(String word) {
//                return word.contains("o");
//            }
//        });

        // use lambda:
        System.out.println("*** Words containing 'e' ***");
        printer.printFilteredWords((String word) -> word.contains("e"));

        System.out.println("*** Words bigger than 4 characters ***");
        printer.printFilteredWords((String word) -> word.length() >= 5);

        System.out.println("*** Words starting with the letter 'a' ***");
        printer.printFilteredWords((word) -> word.startsWith("a"));

        System.out.println("*** Words which have their 2nd char as 'e' ***");
        printer.printFilteredWords((word) -> word.indexOf("e") == 1);

        System.out.println("*** Words with 2 'e''s ***");
        printer.printFilteredWords((word) -> {
            boolean b = false;
            int eCount = 0;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == 'e') {
                    eCount++;
                }
            }
            if (eCount == 2) {
                b = true;
            }
            return b;
            });

        TextPrinter printer2 = new TextPrinter("Zuhur Marouane Jan");

        printer2.printProcessedWords(s -> String.format("Hello %s", s));

//        printer2.printProcessedWords(s -> TextUtil.reverse(s));
//        //Intellij suggests here to convert to method reference

        printer2.printProcessedWords(TextUtil::reverse); // method reference

        TextScrambler scrambler = new TextScrambler();
        printer2.printProcessedWords(scrambler::scramble);

        printer2.printProcessedWords(String::toLowerCase);

//        printer2.printNumberValues(s -> new BigDecimal(s));
        // above does not work - do not know yet how to resolve - investigate

        // if you need to evaluate - you cannot use method reference.
        // if you need to adjust - you should be able to use method reference.
    }

}