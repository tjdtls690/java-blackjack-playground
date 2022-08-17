package com.jun_hyeok.black_jack.domain;

public class Player extends AbstractPlayer {
    public Player(String name) {
        super(name);
    }
    
    public Player(String name, int betMoney) {
        super(name, betMoney);
    }
}
