package blackjack.domain;

import java.util.ArrayList;
import java.util.List;

public class Cards {
    private final List<Card> cards;
    
    public Cards() {
        cards = new ArrayList<>();
    }
    
    public void add(final Card card) {
        cards.add(card);
    }
    
    public int sum() {
        return cards.stream()
                .mapToInt(Card::number)
                .sum();
    }
}
