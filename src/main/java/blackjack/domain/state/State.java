package blackjack.domain.state;

import blackjack.domain.Card;

public interface State {
    State draw(Card card);
}
