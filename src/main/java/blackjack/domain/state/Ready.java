package blackjack.domain.state;

import blackjack.domain.Card;
import blackjack.domain.Cards;

public class Ready implements State {
    private final Cards cards;
    
    public Ready() {
        cards = new Cards();
    }
    
    @Override
    public State draw(final Card card) {
        cards.add(card);
        return new Draw(cards);
    }
}
