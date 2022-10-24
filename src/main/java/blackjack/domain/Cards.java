package blackjack.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cards {
    private static final int BLACK_JACK_NUMBER = 21;
    
    private final List<Card> cards;
    
    public Cards() {
        cards = new ArrayList<>();
    }
    
    public void add(final Card card) {
        cards.add(card);
    }
    
    public boolean isBlackJack() {
        return Number.sum(numbers()) == BLACK_JACK_NUMBER;
    }
    
    private List<Number> numbers() {
        return cards.stream()
                .map(Card::number)
                .collect(Collectors.toList());
    }
    
    public boolean isSizeOne() {
        return cards.size() == 1;
    }
}
