package com.jun_hyeok.black_jack.domain;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class InputViewTest {
    private Players players;
    
    @BeforeEach
    void setUp() {
        players = InputView.inputPlayerNames("jun, fobi, young");
    }
    
    @Test
    @DisplayName("플레이어 객체 생성")
    void create_players() {
        List<Player> playerList = new ArrayList<>();
        playerList.add(new Player("jun"));
        playerList.add(new Player("fobi"));
        playerList.add(new Player("young"));
        
        assertThat(players).isEqualTo(new Players(playerList));
    }
    
    @Test
    @DisplayName("배팅 금액 저장")
    void set_bet_money() {
        List<Integer> betMoneys = new ArrayList<>();
        betMoneys.add(20000);
        betMoneys.add(10000);
        betMoneys.add(30000);
        InputView.saveBetMoneys(players, betMoneys);
    
        List<Player> playerList = new ArrayList<>();
        playerList.add(new Player("jun", 20000));
        playerList.add(new Player("fobi", 10000));
        playerList.add(new Player("young", 30000));
    
        assertThat(players).isEqualTo(new Players(playerList));
    }
}
