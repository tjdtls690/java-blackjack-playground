package com.jun_hyeok.black_jack.domain;

import com.jun_hyeok.black_jack.view.InputView;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayersTest {
    @Test
    @DisplayName("배팅 금액 저장하기")
    void save_bet_money() {
        Players players = InputView.createPlayers("jun, fobi");
        
        List<Integer> betMoneys = new ArrayList<>();
        betMoneys.add(10000);
        betMoneys.add(30000);
        players.saveBetMoney(betMoneys);
        
        HashMap<Player, Integer> betMoneySpace = new HashMap<>();
        betMoneySpace.put(new Player("jun"), 10000);
        betMoneySpace.put(new Player("fobi"), 30000);
        Players playersTestTarget = new Players(players.getPlayerList(), betMoneySpace);
        
        assertThat(players).isEqualTo(playersTestTarget);
    }
}
