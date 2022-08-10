package com.jun_hyeok.black_jack.domain;

import java.util.HashMap;
import java.util.Objects;

public class BetMoneySpace {
    private final HashMap<Player, Integer> betMoneySpace;
    
    public BetMoneySpace(HashMap<Player, Integer> betMoneySpace) {
        this.betMoneySpace = betMoneySpace;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BetMoneySpace that = (BetMoneySpace) o;
        return Objects.equals(betMoneySpace, that.betMoneySpace);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(betMoneySpace);
    }
}
