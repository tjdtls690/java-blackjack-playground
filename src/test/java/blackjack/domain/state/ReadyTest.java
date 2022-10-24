package blackjack.domain.state;

import blackjack.domain.CardTest;
import blackjack.domain.Cards;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReadyTest {
    private State ready;
    
    @BeforeEach
    void setUp() {
        ready = new Ready(new Cards());
    }
    
    @Test
    @DisplayName("뽑은 카드 개수 1장 미만 => Ready")
    void ready() {
        assertThat(ready.draw(CardTest.HEART_QUEEN)).isExactlyInstanceOf(Ready.class);
    }
    
    @Test
    @DisplayName("뽑은 카드 개수 2장 and 합 21 미만 => draw")
    void draw() {
        ready = ready.draw(CardTest.HEART_QUEEN);
        assertThat(ready.draw(CardTest.CLOVER_TWO)).isExactlyInstanceOf(Draw.class);
    }
    
    @Test
    @DisplayName("뽑은 카드 개수 2장 and 합 21 => blackjack")
    void blackjack() {
        ready = ready.draw(CardTest.HEART_QUEEN);
        assertThat(ready.draw(CardTest.SPACE_ACE)).isExactlyInstanceOf(BlackJack.class);
    }
}
