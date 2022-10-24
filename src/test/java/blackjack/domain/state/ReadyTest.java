package blackjack.domain.state;

import blackjack.domain.CardTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReadyTest {
    @Test
    @DisplayName("draw => Draw 리턴")
    void draw() {
        Ready ready = new Ready();
        State state = ready.draw(CardTest.HEART_QUEEN);
        assertThat(state).isExactlyInstanceOf(Draw.class);
    }
}
