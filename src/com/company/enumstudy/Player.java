package com.company.enumstudy;

public class Player {

    private String name;
    private int age;
    private Status presentStatus;

    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Status getPresentStatus() {
        return presentStatus;
    }

    public void setPresentStatus(Status presentStatus) {
        this.presentStatus = presentStatus;
    }
}
