package com.company;


import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.Scanner;

public class FunctionTest {
    
    public static int sum(int a ,int b) {
        int r = 0;
    
        for (int h = a; h <= b; h++) {
            r += h;
        }
        return r;
    }
    
    public static String evenOdd(int sum) {
        String r = new String();
    
        if (sum % 2 == 0) {
            r = "짝수 입니다.";
        } else {
            r = "홀수 입니다.";
        }
        return r;
    }
    public static void main(String[] args) {
        System.out.println("a와 b를 입력해주세요: ");
        Scanner s= new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        sum(a, b);
        evenOdd(sum(a, b));
    }
}














