package com.jun_hyeok.black_jack.domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputView {
    public static Players inputPlayerNames(String playerNames) {
        return new Players(getPlayerNamesList(playerNames));
    }
    
    private static List<Player> getPlayerNamesList(String playerNames) {
        return Arrays.stream(getPlayerNamesArr(playerNames))
                .map(Player::new)
                .collect(Collectors.toList());
    }
    
    private static String[] getPlayerNamesArr(String playerNames) {
        playerNames = playerNames.replaceAll("\\s+", "");
        return playerNames.split(",");
    }
}
