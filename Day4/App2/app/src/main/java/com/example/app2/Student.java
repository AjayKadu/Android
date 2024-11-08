package com.example.app2;

import java.io.Serializable;

public class Student implements Serializable {

    private int rollNo;
    private String name;

    private double marks;

    private int mobile;

    private String course;

    public Student() {
    }

    public Student(int rollNo, String name, double marks, int mobile, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        this.mobile = mobile;
        this.course = course;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
