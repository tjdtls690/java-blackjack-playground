package com.jun_hyeok.black_jack.view;

import com.jun_hyeok.black_jack.domain.Player;
import com.jun_hyeok.black_jack.domain.Players;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class InputViewTest {
    @Test
    @DisplayName("플레이어 객체 생성")
    void create_players() {
        Players players = InputView.createPlayers("jun, fobi, young");
        List<Player> playerList = new ArrayList<>();
        playerList.add(new Player("jun"));
        playerList.add(new Player("fobi"));
        playerList.add(new Player("young"));
        assertThat(players).isEqualTo(new Players(playerList));
    }
}
