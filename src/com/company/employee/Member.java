package com.company.employee;

import com.company.team.Department;

import java.util.Objects;

public class Member {

    private String name;
    private Department department;
    private int age;
    private String email;

    public Member(String name) {
        this.name = name;
    }

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



    @Override
    public int hashCode() {
        return Objects.hash(name, department, age, email);
    }
}
