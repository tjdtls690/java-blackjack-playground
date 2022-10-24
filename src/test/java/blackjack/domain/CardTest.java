package blackjack.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CardTest {
    public static final Card CLOVER_TWO = new Card(Shape.CLOVER, Number.TWO);
    public static final Card HEART_QUEEN = new Card(Shape.HEART, Number.QUEEN);
    public static final Card SPACE_ACE = new Card(Shape.SPACE, Number.ACE);
    
    @Test
    @DisplayName("숫자 구하기")
    void number() {
        assertThat(CLOVER_TWO.number()).isEqualTo(Number.TWO);
    }
}
