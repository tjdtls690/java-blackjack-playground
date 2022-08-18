package com.jun_hyeok.black_jack.domain;

import java.util.Objects;

public class AbstractPlayer implements Playable {
    private final String name;
    private int betMoney;
    
    public AbstractPlayer(String name) {
        this(name, 0);
    }
    
    public AbstractPlayer(String name, int betMoney) {
        this.name = name;
        this.betMoney = betMoney;
    }
    
    @Override
    public void betMoney(int betMoney) {
        this.betMoney = betMoney;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractPlayer that = (AbstractPlayer) o;
        return betMoney == that.betMoney && Objects.equals(name, that.name);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(name, betMoney);
    }
}
