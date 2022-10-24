package blackjack.domain.state;

import blackjack.domain.Card;

public abstract class Finished implements State {
    private static final String IMPOSSIBLE_DRAW_EXCEPTION_MESSAGE = "더이상 카드를 뽑을 수 없습니다.";
    private static final String ALREADY_FINISHED_EXCEPTION_MESSAGE = "더이상 게임을 진행할 수 없습니다.";
    
    @Override
    public State draw(final Card card) {
        throw new IllegalArgumentException(IMPOSSIBLE_DRAW_EXCEPTION_MESSAGE);
    }
    
    @Override
    public State stay() {
        throw new IllegalArgumentException(ALREADY_FINISHED_EXCEPTION_MESSAGE);
    }
}
