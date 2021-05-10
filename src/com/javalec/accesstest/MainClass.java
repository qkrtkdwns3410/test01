package com.javalec.accesstest;

import com.javalec.accesstest_sub.AccessTest;

import javax.lang.model.element.AnnotationValueVisitor;

public class MainClass {
    public static void main(String[] args) {
        AccessTest accessTest = new AccessTest();
    
//        accessTest.a;
//        accessTest.b;
        accessTest.meth();
    }
}
