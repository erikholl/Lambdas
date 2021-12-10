package be.intecbrussel;

import java.math.BigDecimal;

@FunctionalInterface
public interface NumberParser {
    BigDecimal parse(String sentence);
}
