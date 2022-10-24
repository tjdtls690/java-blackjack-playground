package blackjack.domain;

import java.util.List;

public enum Number {
    ACE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    KING(10),
    QUEEN(10),
    JACK(10);
    
    private static final int ACE_ADDITIONAL_HIDDEN_NUMBER = 10;
    private static final int BLACK_JACK_NUMBER = 21;
    
    private final int number;
    
    Number(final int number) {
        this.number = number;
    }
    
    public static int sum(final List<Number> numbers) {
        if (isContainsAce(numbers) && isNotExceededAceHiddenSumBlackJackNumber(numbers)) {
            return aceHiddenSum(numbers);
        }
        
        return numbersSum(numbers);
    }
    
    private static boolean isNotExceededAceHiddenSumBlackJackNumber(final List<Number> numbers) {
        return aceHiddenSum(numbers) <= BLACK_JACK_NUMBER;
    }
    
    private static int aceHiddenSum(final List<Number> numbers) {
        return numbersSum(numbers) + ACE_ADDITIONAL_HIDDEN_NUMBER;
    }
    
    private static int numbersSum(final List<Number> numbers) {
        return numbers.stream()
                .mapToInt(Number::number)
                .sum();
    }
    
    private static boolean isContainsAce(final List<Number> numbers) {
        return numbers.stream()
                .anyMatch(Number::isAce);
    }
    
    private boolean isAce() {
        return this == ACE;
    }
    
    public int number() {
        return number;
    }
}
