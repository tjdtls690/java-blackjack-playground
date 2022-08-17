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
    
    public static void saveBetMoneys(Players players, List<Integer> betMoneys) {
        // 배팅금액 리스트 입력받는 메서드는 나중에 구현하기.
        
        players.inputBetMoneys(betMoneys);
    }
}
