package blackjack.domain;

public enum Shape {
    CLOVER("클로버"),
    DIAMOND("다이아몬드"),
    SPACE("스페이스"),
    HEART("하트");
    
    private final String shape;
    
    Shape(final String shape) {
        this.shape = shape;
    }
}
