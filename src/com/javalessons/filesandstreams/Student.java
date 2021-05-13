package com.javalessons.filesandstreams;

import com.javalessons.collections.treemap.SubjectGrade;

import java.io.Serializable;
import java.util.Set;

public class Student implements Serializable {

    private final String name;
    private final float averageGrade;
    private Set<SubjectGrade> grades;

    public Student(String name, float averageGrade, Set<SubjectGrade> grades) {
        this.name = name;
        this.averageGrade = averageGrade;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public float getAverageGrade() {
        return averageGrade;
    }

    public Set<SubjectGrade> getGrades() {
        return grades;
    }
}
