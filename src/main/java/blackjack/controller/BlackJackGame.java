package blackjack.controller;

import blackjack.domain.Players;
import blackjack.view.InputView;

public class BlackJackGame {
    public void play() {
        Players players = InputView.inputPlayers();
    }
}
