package com.javalessons.collections.treemap;

public class AverageStudentGrade implements Comparable<AverageStudentGrade> {

    private final String name;
    private final float averageGrade;

    public AverageStudentGrade(String name, float averageGrade) {
        this.name = name;
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return name;
    }

    public float getAverageGrade() {
        return averageGrade;
    }

    @Override
    public String toString() {
        return "Name " + name + "  Grade "+averageGrade;
    }

    @Override
    public int compareTo(AverageStudentGrade that) {
        if (this.averageGrade < that.getAverageGrade()) {
            return -1;
        }
        if (this.averageGrade > that.getAverageGrade()) {
            return 1;
        }
        return name.compareTo(that.getName());
    }
}
