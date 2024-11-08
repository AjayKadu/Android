package com.example.app1;

import java.io.Serializable;

public class Course implements Serializable {

    private int id;
    private String name;
    private double fees;
    private String desc;
    private String eligibility;
    private int image;
    public Course() {
    }

    public Course(int id, String name, double fees, String desc, String eligibility, int image) {
        this.id = id;
        this.name = name;
        this.fees = fees;
        this.desc = desc;
        this.eligibility = eligibility;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getEligibility() {
        return eligibility;
    }

    public void setEligibility(String eligibility) {
        this.eligibility = eligibility;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
