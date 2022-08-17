package com.jun_hyeok.black_jack.domain;

public enum CardNum {
    ACE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    KING(10),
    QUEEN(10),
    JACK(10);
    
    private int cardNum;
    
    CardNum(int cardNum) {
        this.cardNum = cardNum;
    }
}
