package blackjack.domain.state;

import blackjack.domain.Cards;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FailTest {
    @Test
    @DisplayName("종료")
    void is_finished() {
        State state = new Fail(new Cards());
        assertThat(state.isFinished()).isTrue();
    }
}