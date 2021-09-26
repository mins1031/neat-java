package com.company.enumstudy;

public class Student {

    private String name;
    private int age;
    private Grade presentStatus;

    public Student() {
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

    public Grade getPresentStatus() {
        return presentStatus;
    }

    public void setPresentStatus(Grade presentStatus) {
        this.presentStatus = presentStatus;
    }
}
