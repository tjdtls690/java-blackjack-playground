package com.jun_hyeok.black_jack.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PlayerFactory {
    public static List<Playable> create(String playerNames) {
        List<Playable> playerList = new ArrayList<>(Collections.singletonList(new Dealer()));
        playerList.addAll(getPlayerList(playerNames));
        return playerList;
    }
    
    private static List<Playable> getPlayerList(String playerNames) {
        return Arrays.stream(getPlayerNamesArr(playerNames))
                .map(Player::new)
                .collect(Collectors.toList());
    }
    
    private static String[] getPlayerNamesArr(String playerNames) {
        playerNames = playerNames.replaceAll("\\s+", "");
        return playerNames.split(",");
    }
}
