package com.jun_hyeok.black_jack.view;

import com.jun_hyeok.black_jack.domain.Player;
import com.jun_hyeok.black_jack.domain.Players;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputView {
    public static Players createPlayers(String playerNames) {
        String[] playerNameList = dividePlayerNames(playerNames);
        List<Player> playerList = getPlayerList(playerNameList);
        return new Players(playerList);
    }
    
    private static List<Player> getPlayerList(String[] playerNameList) {
        return Arrays.stream(playerNameList)
                .map(Player::new)
                .collect(Collectors.toList());
    }
    
    private static String[] dividePlayerNames(String playerNames) {
        playerNames = playerNames.replaceAll("\\s+", "");
        return playerNames.split(",");
    }
}
