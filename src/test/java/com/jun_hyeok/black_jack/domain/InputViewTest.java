package com.jun_hyeok.black_jack.domain;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class InputViewTest {
    
    @Test
    void create_players() {
        Players players = InputView.inputPlayerNames("jun, fobi, young");
        
        List<Player> playerList = new ArrayList<>();
        playerList.add(new Player("jun"));
        playerList.add(new Player("fobi"));
        playerList.add(new Player("young"));
        
        assertThat(players).isEqualTo(new Players(playerList));
    }
}
