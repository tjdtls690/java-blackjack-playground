package blackjack.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CardsTest {
    private Cards cards;
    
    @BeforeEach
    void setUp() {
        cards = new Cards();
    }
    
    @Test
    @DisplayName("블랙잭")
    void isBlackJack() {
        cards.add(CardTest.SPACE_ACE);
        cards.add(CardTest.CLOVER_QUEEN);
        
        assertThat(cards.isBlackJackNumber()).isTrue();
    }
    
    @Test
    void isSizeOne() {
        cards.add(CardTest.SPACE_ACE);
        
        assertThat(cards.isSizeOne()).isTrue();
    }
}