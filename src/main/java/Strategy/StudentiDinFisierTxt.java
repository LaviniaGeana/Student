package Strategy;

import ro.ulbs.proiectaresoftware.students.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentiDinFisierTxt implements StudentiImport {

    private String fileName3;

    public StudentiDinFisierTxt(String fileName) {
        this.fileName3 = fileName;
    }

    @Override
    public List<Student> doImport() {
        List<Student> studentiCititi = new ArrayList<>();

        System.out.println("--- Se citesc datele din fisierul: " + fileName3 + " ---");

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName3))) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println("Linie citita din fisier: " + line);

            }
        } catch (IOException e) {
            System.err.println("A aparut o eroare la citirea din fidier: " + e.getMessage());
        }

        return studentiCititi;
    }
}