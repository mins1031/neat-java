package com.company.team;

import java.util.Objects;

public class Department {

    private String nameOfDepart;

    public Department(String nameOfDepart) {
        this.nameOfDepart = nameOfDepart;
    }

    public String getNameOfDepart() {
        return nameOfDepart;
    }

    public void setNameOfDepart(String nameOfDepart) {
        this.nameOfDepart = nameOfDepart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(nameOfDepart, that.nameOfDepart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfDepart);
    }
}
