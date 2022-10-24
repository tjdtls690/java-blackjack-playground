package blackjack.domain.state;

import blackjack.domain.Cards;

public class Fail extends Finished {
    private final Cards cards;
    
    public Fail(final Cards cards) {
        this.cards = cards;
    }
}
