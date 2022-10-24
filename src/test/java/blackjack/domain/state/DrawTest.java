package blackjack.domain.state;

import blackjack.domain.CardTest;
import blackjack.domain.Cards;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DrawTest {
    private State draw;
    
    @BeforeEach
    void setUp() {
        draw = new Draw(new Cards());
    }
    
    @Test
    @DisplayName("합 21 미만인 경우 => 다시 뽑기 선택(y) => Draw")
    void draw() {
        draw.draw(CardTest.HEART_QUEEN);
        assertThat(draw.draw(CardTest.CLOVER_TWO)).isExactlyInstanceOf(Draw.class);
    }
    
    @Test
    @DisplayName("합 21 미만인 경우 => 그만 뽑기 선택(n) => Stay")
    void stay() {
        assertThat(draw.stay()).isExactlyInstanceOf(Stay.class);
    }
    
    @Test
    @DisplayName("합 21 초과인 경우 => Fail")
    void fail() {
        draw.draw(CardTest.CLOVER_QUEEN);
        draw.draw(CardTest.HEART_QUEEN);
        assertThat(draw.draw(CardTest.CLOVER_TWO)).isExactlyInstanceOf(Fail.class);
    }
}
