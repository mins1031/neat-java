package com.company.enumstudy;

public enum Grade {
    FIRST(20),SECOND(21),THIRD(22),FOURTH(23);
    private int averageAge;

    Grade(int averageAge) {
        this.averageAge = averageAge;
    }

    public int getAverageAge() {
        return averageAge;
    }
}
