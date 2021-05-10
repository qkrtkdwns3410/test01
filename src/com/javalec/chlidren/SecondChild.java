package com.javalec.chlidren;

import com.javalec.papa.PapaPouch;

public class SecondChild {
    public SecondChild() {
    
    }
    
    public void takeMoney(int money) {
        PapaPouch.MONEY = PapaPouch.MONEY - money;
        if (PapaPouch.MONEY < 0) {
            System.out.println("둘째는 돈이 없어 못 받았어요.ㅜㅜ");
        }
    }
}
