package blackjack.domain.state;

import blackjack.domain.CardTest;
import blackjack.domain.Cards;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReadyTest {
    private State state;
    
    @BeforeEach
    void setUp() {
        state = new Ready(new Cards());
    }
    
    @Test
    @DisplayName("뽑은 카드 개수 1장 미만 => Ready")
    void ready() {
        assertThat(state.draw(CardTest.HEART_QUEEN)).isExactlyInstanceOf(Ready.class);
    }
    
    @Test
    @DisplayName("뽑은 카드 개수 2장 and 합 21 미만 => draw")
    void draw() {
        state = state.draw(CardTest.HEART_QUEEN);
        assertThat(state.draw(CardTest.CLOVER_TWO)).isExactlyInstanceOf(Draw.class);
    }
    
    @Test
    @DisplayName("뽑은 카드 개수 2장 and 합 21 => blackjack")
    void blackjack() {
        state = state.draw(CardTest.HEART_QUEEN);
        assertThat(state.draw(CardTest.SPACE_ACE)).isExactlyInstanceOf(BlackJack.class);
    }
    
    @Test
    @DisplayName("계속 진행")
    void is_finished() {
        assertThat(state.isFinished()).isFalse();
    }
}
