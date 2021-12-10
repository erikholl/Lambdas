package be.intecbrussel;

public class TextScrambler {

    public String scramble (String sentence) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sentence.length(); i++) {
            sb = sentence.charAt(i) == 'a'
                    ? sb.append('@')
                    : sentence.charAt(i) == 'e'
                    ? sb.append('€')
                    : sentence.charAt(i) == 'l'
                    ? sb.append('1')
                    : sentence.charAt(i) == 'o'
                    ? sb.append('0')
                    : sb.append(sentence.charAt(i));
        }
        return sb.toString();
    }
}
