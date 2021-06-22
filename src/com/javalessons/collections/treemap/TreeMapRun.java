package com.javalessons.collections.treemap;

import java.util.HashSet;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapRun {

    public static void main(String[] args) {
        NavigableMap<AverageStudentGrade, Set<SubjectGrade>> studMap = createGrades();
        printGrades(studMap);
    }

    public static NavigableMap<AverageStudentGrade, Set<SubjectGrade>> createGrades() {

        Set<SubjectGrade> student1 = new HashSet<>();
        student1.add(new SubjectGrade("Math", 89));
        student1.add(new SubjectGrade("History", 75));
        student1.add(new SubjectGrade("Physics", 69));

        Set<SubjectGrade> student2 = new HashSet<>();
        student2.add(new SubjectGrade("Math", 64));
        student2.add(new SubjectGrade("History", 82));
        student2.add(new SubjectGrade("Physics", 94));

        Set<SubjectGrade> student3 = new HashSet<>();
        student3.add(new SubjectGrade("Math", 58));
        student3.add(new SubjectGrade("History", 71));
        student3.add(new SubjectGrade("Physics", 80));

        Set<SubjectGrade> student4 = new HashSet<>();
        student4.add(new SubjectGrade("Math", 77));
        student4.add(new SubjectGrade("History", 85));
        student4.add(new SubjectGrade("Physics", 91));

        Set<SubjectGrade> student5 = new HashSet<>();
        student5.add(new SubjectGrade("Math", 84));
        student5.add(new SubjectGrade("History", 73));
        student5.add(new SubjectGrade("Physics", 94));

        NavigableMap<AverageStudentGrade, Set<SubjectGrade>> map = new TreeMap<>();
        map.put(new AverageStudentGrade("student1", calcAver(student1)), student1);
        map.put(new AverageStudentGrade("student2", calcAver(student2)), student2);
        map.put(new AverageStudentGrade("student3", calcAver(student3)), student3);
        map.put(new AverageStudentGrade("student4", calcAver(student4)), student4);
        map.put(new AverageStudentGrade("student5", calcAver(student5)), student5);

        return map;
    }

    private static void printGrades (NavigableMap<AverageStudentGrade, Set<SubjectGrade>> grades){
        Set<AverageStudentGrade> keys = grades.keySet();
        for (AverageStudentGrade gr : keys){
            System.out.println(gr);
        }
    }

    private static float calcAver(Set<SubjectGrade> grades) {
        float sum = 0f;
        for (SubjectGrade sg : grades) {
            sum += sg.getGrade();
        }
        return sum / grades.size();
    }
}
