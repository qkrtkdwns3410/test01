package com.javalec.manager;

import java.util.ArrayList;

public class StudentManager {
    ArrayList<Student> students = new ArrayList<Student>();
    StudentExpel studentExpel = new StudentExpel();
    
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
    
        studentManager.addStudent("박상준", 31, 201420812, "관세물류학과");
        studentManager.addStudent("김진주", 31, 201220812, "경영정보학과");
        studentManager.addStudent("박진주", 28, 201120812, "관세물류학과");
        studentManager.addStudent("정성용", 21, 201520812, "진정해");
        studentManager.addStudent("박상준", 31, 201120812, "경찰정보");
        studentManager.addStudent("김철구", 28, 201320812, "경영정보");
    
        studentManager.students.get(0).updateInfo(1,"홍길똥");
        System.out.println(studentManager.students.get(0).getName());
    }
    
    public void addStudent(String name, int age, int studentNum, String major) {
        students.add(new Student(name, age, studentNum, major));
        System.out.println(name+" 학생 정보 입력 성공!!");
    }
}

