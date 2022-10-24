package blackjack.domain.state;

import blackjack.domain.Card;
import blackjack.domain.CardTest;
import blackjack.domain.Cards;
import blackjack.domain.CardsTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DrawTest {
    @Test
    @DisplayName("합 21 미만인 경우 => 다시 뽑기 선택(y) => Draw")
    void draw() {
        Cards cards = new Cards();
        final Draw draw = new Draw(cards);
        draw.draw(CardTest.HEART_QUEEN);
    
        assertThat(draw.draw(CardTest.CLOVER_TWO)).isExactlyInstanceOf(Draw.class);
    }
    
    @Test
    @DisplayName("합 21 미만인 경우 => 그만 뽑기 선택(n) => Stay")
    void stay() {
        Cards cards = new Cards();
        final Draw draw = new Draw(cards);
        
        assertThat(draw.stay()).isExactlyInstanceOf(Stay.class);
    }
    
    @Test
    @DisplayName("합 21인 경우  => BlackJack")
    void blackjack() {
        Cards cards = new Cards();
        final Draw draw = new Draw(cards);
        draw.draw(CardTest.HEART_QUEEN);
        
        assertThat(draw.draw(CardTest.SPACE_ACE)).isExactlyInstanceOf(BlackJack.class);
    }
}
