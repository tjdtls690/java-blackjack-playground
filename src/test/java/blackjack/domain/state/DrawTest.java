package blackjack.domain.state;

import blackjack.domain.CardTest;
import blackjack.domain.Cards;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DrawTest {
    private State state;
    
    @BeforeEach
    void setUp() {
        state = new Draw(new Cards());
    }
    
    @Test
    @DisplayName("합 21 미만인 경우 => 다시 뽑기 선택(y) => Draw")
    void draw() {
        state.draw(CardTest.HEART_QUEEN);
        assertThat(state.draw(CardTest.CLOVER_TWO)).isExactlyInstanceOf(Draw.class);
    }
    
    @Test
    @DisplayName("합 21 미만인 경우 => 그만 뽑기 선택(n) => Stay")
    void stay() {
        assertThat(state.stay()).isExactlyInstanceOf(Stay.class);
    }
    
    @Test
    @DisplayName("합 21 초과인 경우 => Fail")
    void fail() {
        state.draw(CardTest.CLOVER_QUEEN);
        state.draw(CardTest.HEART_QUEEN);
        assertThat(state.draw(CardTest.CLOVER_TWO)).isExactlyInstanceOf(Fail.class);
    }
    
    @Test
    @DisplayName("합 21인 경우 => Stay")
    void stay_blackjack_number() {
        state.draw(CardTest.CLOVER_QUEEN);
        assertThat(state.draw(CardTest.SPACE_ACE)).isExactlyInstanceOf(Stay.class);
    }
    
    @Test
    @DisplayName("계속 진행")
    void is_finished() {
        assertThat(state.isFinished()).isFalse();
    }
}
