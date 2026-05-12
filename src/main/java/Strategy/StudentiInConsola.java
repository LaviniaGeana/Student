package Strategy;

import ro.ulbs.proiectaresoftware.students.Student;

import java.util.List;

public class StudentiInConsola implements StudentiExport
{
    @Override
    public void doExport(List<Student> studenti) {
        System.out.println("--- Export studenti in consola ---");
        for (Student s : studenti) {
            System.out.println(s.toString());

        }
    }
}
