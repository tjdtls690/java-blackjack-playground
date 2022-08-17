package com.jun_hyeok.black_jack.domain;

import java.util.List;
import java.util.Objects;

public class Players {
    private final List<Player> playerList;
    
    public Players(List<Player> playerList) {
        this.playerList = playerList;
    }
    
    public void inputBetMoneys(List<Integer> betMoneys) {
        for (int i = 0; i < playerList.size(); i++) {
            playerList.get(i).betMoney(betMoneys.get(i));
        }
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Players players = (Players) o;
        return Objects.equals(playerList, players.playerList);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(playerList);
    }
}
