package com.jun_hyeok.black_jack.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Players {
    private final List<Player> playerList;
    private BetMoneySpace betMoneySpace;
    
    public Players(List<Player> playerList) {
        this(playerList, null);
    }
    
    public Players(List<Player> playerList, HashMap<Player, Integer> betMoneySpace) {
        this.playerList = playerList;
        this.betMoneySpace = new BetMoneySpace(betMoneySpace);
    }
    
    public void saveBetMoney(List<Integer> betMoneys) {
        HashMap<Player, Integer> betMoneySpace = inputBetMoneys(betMoneys);
        this.betMoneySpace = new BetMoneySpace(betMoneySpace);
    }
    
    private HashMap<Player, Integer> inputBetMoneys(List<Integer> betMoneys) {
        HashMap<Player, Integer> betMoneySpace = new HashMap<>();
        for (int i = 0; i < betMoneys.size(); i++) {
            betMoneySpace.put(playerList.get(i), betMoneys.get(i));
        }
        return betMoneySpace;
    }
    
    public List<Player> getPlayerList() {
        return playerList;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Players players = (Players) o;
        return Objects.equals(playerList, players.playerList) && Objects.equals(betMoneySpace, players.betMoneySpace);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(playerList, betMoneySpace);
    }
}
