package blackjack.domain.state;

import blackjack.domain.Card;
import blackjack.domain.Cards;

public class Ready extends Running {
    private static final String NOT_START_EXCEPTION_MESSAGE = "아직 게임 시작 전입니다.";
    
    private final Cards cards;
    
    public Ready(Cards cards) {
        this.cards = cards;
    }
    
    @Override
    public State draw(final Card card) {
        cards.add(card);
        if (cards.isSizeOne()) {
            return new Ready(cards);
        }
        
        if (cards.isBlackJackNumber()) {
            return new BlackJack(cards);
        }
        return new Draw(cards);
    }
    
    @Override
    public State stay() {
        throw new IllegalArgumentException(NOT_START_EXCEPTION_MESSAGE);
    }
}
