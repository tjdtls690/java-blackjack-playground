package blackjack.domain.state;

import blackjack.domain.Cards;

public class BlackJack extends Finished {
    private final Cards cards;
    
    public BlackJack(final Cards cards) {
        this.cards = cards;
    }
}
