package pl.sda.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class PubSubMain {

    public static void main(String[] args) {
        Professor professor = new Professor();
        List<Student> students = new ArrayList<>();


        for (int i = 0; i < 50; i++) {
            final Student student = new Student();
            students.add(student);
            professor.register(student);
        }

        for (Student student : students) {
            professor.addResult(student.getUuid());

            System.out.println();
            System.out.println();
            System.out.println();
        }


    }
}
