package com.sunbeam;

import java.io.Serializable;

public class Employee implements Serializable {

    private int empid;
    private String name;
    private double salary;

    public Employee() {
    }

    public Employee(int empid, String name, double salary) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
    }

    public int getEmpid() {
        return empid;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee\n" +
                "empid=" + empid +
                ", name='" + name;
    }
}
