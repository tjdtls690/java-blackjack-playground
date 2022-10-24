package blackjack.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CardsTest {
    @Test
    @DisplayName("카드들의 숫자 합 구하기")
    void numbers_sum() {
        Cards cards = new Cards();
        cards.add(CardTest.CLOVER_TWO);
        cards.add(CardTest.HEART_QUEEN);
        assertThat(cards.sum()).isEqualTo(12);
    }
}
