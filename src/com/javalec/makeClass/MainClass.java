package com.javalec.makeClass;


public class MainClass {
    public static void main(String[] args) {
        ManClass mc = new ManClass();
        ManClass mc1 = new ManClass(15, 160, 50, "010-1234-1234");
        mc.getAge();
        mc.setAge(16);
    
        double d = mc.calculateBMI();
        
    }
}
