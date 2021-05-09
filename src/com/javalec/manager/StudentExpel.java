package com.javalec.manager;

import java.util.ArrayList;
//expel은 제적관련 자료입니다.
public class StudentExpel {
    ArrayList<Student> expelStudents;
    
    public StudentExpel() {
        expelStudents = new ArrayList<Student>(); //배열 초기화
        
    }
    
    public void addExpelStudent(String name, int age, int studentNum, String major) {
        expelStudents.add(new Student(name, age, studentNum, major));
    }
}
