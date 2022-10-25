package blackjack.domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Players {
    private final List<Player> players;
    
    public Players(final List<Player> players) {
        this.players = players;
    }
}
