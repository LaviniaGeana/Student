package Strategy;

import ro.ulbs.proiectaresoftware.students.Student;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class StudentiInFisierTxt implements StudentiExport {


    private String fileName;

    // constructor
    public StudentiInFisierTxt(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void doExport(List<Student> studenti) {

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (Student s : studenti) {
                writer.println(s.toString());
            }
            System.out.println("Lista a fost exportata cu succes in fisierul: " + fileName);
        } catch (IOException e) {
            System.err.println("A aparut o eroare la scrierea in fisier: " + e.getMessage());
        }
    }
}