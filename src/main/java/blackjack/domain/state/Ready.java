package blackjack.domain.state;

import blackjack.domain.Card;
import blackjack.domain.Cards;

public class Ready implements State {
    private static final String NOT_START_EXCEPTION_MESSAGE = "아직 게임 시작 전입니다.";
    
    private final Cards cards;
    
    public Ready() {
        cards = new Cards();
    }
    
    @Override
    public State draw(final Card card) {
        cards.add(card);
        return new Draw(cards);
    }
    
    @Override
    public State stay() {
        throw new IllegalArgumentException(NOT_START_EXCEPTION_MESSAGE);
    }
}
