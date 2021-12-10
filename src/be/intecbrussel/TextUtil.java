package be.intecbrussel;

public interface TextUtil {

    static String reverse(String sentence) {
        StringBuilder sb = new StringBuilder();
        for (String word : sentence.split(" ")) {
            sb.append(" ").append(word);
        }
        sb.reverse();
        return sb.toString();
    }

}
