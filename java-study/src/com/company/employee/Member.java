package com.company.employee;

import com.company.team.Department;

public class Member {

    private String name;
    private Department department;
    private int age;
    private String email;

    public Member(String name, Department department, int age, String email) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
