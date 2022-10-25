package blackjack.view;

import blackjack.domain.Player;
import blackjack.domain.Players;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputView {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String PLAYERS_INPUT_MESSAGE = "게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)";
    
    public static Players inputPlayers() {
        try {
            System.out.println(PLAYERS_INPUT_MESSAGE);
            return new Players(parsePlayers(SCANNER.nextLine()));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return inputPlayers();
        }
    }
    
    private static List<Player> parsePlayers(final String playersName) {
        return Arrays.stream(playersNameSplit(playersName))
                .map(Player::new)
                .collect(Collectors.toList());
    }
    
    private static String[] playersNameSplit(final String playersName) {
        return playersName.split(",");
    }
}
