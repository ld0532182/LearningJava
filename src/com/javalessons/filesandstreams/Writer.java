package com.javalessons.filesandstreams;

import com.javalessons.collections.treemap.AverageStudentGrade;
import com.javalessons.collections.treemap.SubjectGrade;

import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;

public class Writer implements Serializable {

      void writeFile(SortedMap<AverageStudentGrade, Set<SubjectGrade>> grades, String fileName) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        for (AverageStudentGrade gradeKey: grades.keySet()){
            writer.write("=================================================\n");
            writer.write("Name "+ gradeKey.getName() + " Average grade = "+gradeKey.getAverageGrade()+"\n");
            for (SubjectGrade gradeVal : grades.get(gradeKey)){
                writer.write("Subject: " +gradeVal.getSubject() + " Grade "+ gradeVal.getGrade()+"\n");
            }
        }
        writer.close();
    }

    void writeObjects(List<Student> students, String fileName){
          try (ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(Paths.get(fileName)))) {
              for(Student student : students) {
                  out.writeObject(student);
              }
                out.writeObject(new Student("", -1, null));
          } catch (IOException e){
              System.out.println("File can't be opened.");
              e.printStackTrace();
          }

    }


}
