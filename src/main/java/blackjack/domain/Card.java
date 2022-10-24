package blackjack.domain;

public class Card {
    private final Shape shape;
    private final Number number;
    
    public Card(final Shape shape, final Number number) {
        this.shape = shape;
        this.number = number;
    }
    
    public int number() {
        return number.number();
    }
}
