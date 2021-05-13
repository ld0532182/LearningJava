package com.javalessons.filesandstreams;

import com.javalessons.collections.treemap.AverageStudentGrade;
import com.javalessons.collections.treemap.SubjectGrade;
import com.javalessons.collections.treemap.TreeMapRun;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;

public class IOMain {

    private static final String FILE_NAME = "gradeBook.txt";
    private static final String OBJECTS_FILE = "students.bin";

    public static void main(String[] args) throws IOException {
        SortedMap<AverageStudentGrade, Set<SubjectGrade>> grades = TreeMapRun.createGrades();
        Reader reader = new Reader();
        Writer writer = new Writer();

//        writer.writeFile(grades, FILE_NAME);
//        reader.readFile(FILE_NAME);
        processGrades(grades, writer, OBJECTS_FILE);
        outputObjects(reader, OBJECTS_FILE);
    }

    private static void processGrades(SortedMap<AverageStudentGrade, Set<SubjectGrade>> grades, Writer writer,
                                      String fileName) {
        List<Student> students = new ArrayList<>();
        for(AverageStudentGrade gradesKey : grades.keySet()) {
            students.add(new Student(gradesKey.getName(), gradesKey.getAverageGrade(), grades.get(gradesKey)));
        }
        writer.writeObjects(students, fileName);

    }

    private static void outputObjects(Reader reader, String fileName) {
        List<Student> students = reader.readObjects(fileName);
        for(Student st : students) {
            System.out.printf("%s, %f\n", st.getName(), st.getAverageGrade());
            System.out.println(st.getGrades());
        }

    }
}
