package blackjack.domain.state;

import blackjack.domain.Card;
import blackjack.domain.Cards;

public class Stay extends Finished {
    private final Cards cards;
    
    public Stay(final Cards cards) {
        this.cards = cards;
    }
}
