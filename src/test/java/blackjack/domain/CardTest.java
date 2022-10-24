package blackjack.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CardTest {
    public static final Card CARD = new Card(Shape.CLOVER, Number.TWO);
    
    @Test
    @DisplayName("숫자 구하기")
    void number() {
        assertThat(CARD.number()).isEqualTo(2);
    }
}
