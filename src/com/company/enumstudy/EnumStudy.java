package com.company.enumstudy;

import java.util.ArrayList;
import java.util.List;

public class EnumStudy {
    public static void main(String[] args){
        List<Student> studentList = new ArrayList<>();
        Student newStudent = new Student();
        newStudent.setName("min");
        newStudent.setAge(23);
        newStudent.setPresentStatus(Grade.THIRD);
    }
}
