package com.javalec.staticex;

import com.javalec.chlidren.FirstChild;
import com.javalec.chlidren.SecondChild;
import com.javalec.chlidren.ThirdChild;
import com.javalec.papa.PapaPouch;

public class MainClass {
    public static void main(String[] args) {
        FirstChild firstChild = new FirstChild();
        firstChild.takeMoney(100);
        SecondChild secondChild = new SecondChild();
        secondChild.takeMoney(100);
        ThirdChild thirdChild = new ThirdChild();
        thirdChild.takeMoney(100);
    
        System.out.println("PapaPouch.money is "+ PapaPouch.MONEY);
    }
}
