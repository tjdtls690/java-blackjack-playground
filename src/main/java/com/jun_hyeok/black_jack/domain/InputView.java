package com.jun_hyeok.black_jack.domain;

import java.util.List;

public class InputView {
    public static Players inputPlayerNames(String playerNames) {
        return new Players(getPlayerNamesList(playerNames));
    }
    
    private static List<Playable> getPlayerNamesList(String playerNames) {
        return PlayerFactory.create(playerNames);
    }
    
    public static void saveBetMoneys(Players players, List<Integer> betMoneys) {
        // 배팅금액 리스트 입력받는 메서드는 나중에 구현하기.
        
        players.inputBetMoneys(betMoneys);
    }
}
