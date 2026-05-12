package ro.ulbs.proiectaresoftware.students;

import java.util.Objects;

public class Student
{

   private int numarMatricol;
   private String prenume;
   private String nume;
   private String formatieDeStudiu;
   private double nota;

    public Student(int numarMatricol,String prenume,String nume,String formatieDeStudiu){
        this.numarMatricol=numarMatricol;
        this.prenume=prenume;
        this.nume=nume;
        this.formatieDeStudiu=formatieDeStudiu;
        this.nota=0;

    }


    public Student(int numarMatricol, String prenume, String nume, String formatieDeStudiu,double nota) {
        this.numarMatricol = numarMatricol;
        this.prenume = prenume;
        this.nume = nume;
        this.formatieDeStudiu = formatieDeStudiu;
        this.nota = nota;

    }

    public int getNumarMatricol() {
        return numarMatricol;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getNume() {
        return nume;
    }

    public String getFormatieDeStudiu() {
        return formatieDeStudiu;
    }

    public double getNota() { return nota; }

    @Override
    public String toString()
    {
        return String.format("%15d %15s %15s %15s %15f",numarMatricol, prenume, nume, formatieDeStudiu, nota);
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return numarMatricol == student.numarMatricol && Double.compare(nota, student.nota) == 0 && Objects.equals(prenume, student.prenume) && Objects.equals(nume, student.nume) && Objects.equals(formatieDeStudiu, student.formatieDeStudiu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numarMatricol, prenume, nume, formatieDeStudiu, nota);
    }
}
