package DesignPatterns;


import Strategy.StudentiExport; 
import ro.ulbs.proiectaresoftware.students.Student;
import java.util.List;

public class ExportTimeDecorator implements StudentiExport {

    private StudentiExport decoratedExport;

    public ExportTimeDecorator(StudentiExport decoratedExport) {
        this.decoratedExport = decoratedExport;
    }

    @Override
    public void doExport(List<Student> studenti) {

        long startTime = System.currentTimeMillis();


        decoratedExport.doExport(studenti);


        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;


        System.out.println("[Decorator] Timpul de executie al exportului a fost de: " + executionTime + " ms.\n");
    }
}
