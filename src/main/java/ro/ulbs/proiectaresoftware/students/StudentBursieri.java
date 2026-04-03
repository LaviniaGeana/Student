package ro.ulbs.proiectaresoftware.students;

import java.util.Objects;

public class StudentBursieri extends Student
{
    double cuantumBursa;

    public StudentBursieri(int NumarMatricol,String prenume,String nume,String formatieDeStudiu,float nota,double cuantumBursa)
    {
        super(NumarMatricol,prenume,nume,formatieDeStudiu,nota);
        this.cuantumBursa=cuantumBursa;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        StudentBursieri that = (StudentBursieri) o;
        return Double.compare(cuantumBursa, that.cuantumBursa) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cuantumBursa);
    }

    @Override
    public String toString() {
        return super.toString()+String.format(" %15f",cuantumBursa);
    }

}
