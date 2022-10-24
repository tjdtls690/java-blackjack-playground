package blackjack.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CardsTest {
    public static final Cards CARDS = new Cards();
    
    @Test
    @DisplayName("카드들의 숫자 합 구하기")
    void numbers_sum() {
        CARDS.add(CardTest.CLOVER_TWO);
        CARDS.add(CardTest.HEART_QUEEN);
        assertThat(CARDS.sum()).isEqualTo(12);
    }
}
