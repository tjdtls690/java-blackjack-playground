package blackjack.domain.state;

import blackjack.domain.Card;
import blackjack.domain.Cards;

public class Draw implements State {
    private final Cards cards;
    
    public Draw(final Cards cards) {
        this.cards = cards;
    }
    
    @Override
    public State draw(final Card card) {
        cards.add(card);
        if (cards.isFail()) {
            return new Fail(cards);
        }
        
        if (cards.isBlackJackNumber()) {
            return new Stay(cards);
        }
        return new Draw(cards);
    }
    
    @Override
    public State stay() {
        return new Stay(cards);
    }
}
