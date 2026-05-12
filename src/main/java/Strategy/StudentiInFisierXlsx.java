package Strategy;

import ro.ulbs.proiectaresoftware.students.Student;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class StudentiInFisierXlsx implements StudentiExport {

    private String fileName;

    // Constructorul
    public StudentiInFisierXlsx(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void doExport(List<Student> studenti) {

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            writer.println("--- Date exportate---");
            for (Student s : studenti) {
                writer.println(s.toString());
            }
            System.out.println("Lista a fost exportata cu succes in fisierul Excel: " + fileName);
        } catch (IOException e) {
            System.err.println("A apărut o eroare la scrierea în fișierul Excel: " + e.getMessage());
        }
    }
}