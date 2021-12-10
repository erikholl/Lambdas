package be.intecbrussel;

@FunctionalInterface
public interface WordFilter {
    boolean isValid(String sentence);

}
