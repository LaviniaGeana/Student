package Strategy;

import ro.ulbs.proiectaresoftware.students.Student;

import java.util.Arrays;
import java.util.List;

public class AplicatieCuStrategy
{
    public static void main(String[] args)
    {
        List<Student> studenti = Arrays.asList(
                new Student(1025,"Andrei","Popa","ISM141/2", 8.70),
                new Student(1024,"Ioan","Mihalcea","ISM141/1", 10),
                new Student(1026,"Anamaria","Prodan","TI131/1", 8.90),
                new Student(1029,"Bianca","Popescu","TI131/1", 10),
                new Student(1029,"Maria","Pana","TI131/,", 4.10),
                new Student(1029,"Gabriela","Mohanu","TI131/2", 7.33),
                new Student(1029,"Marius","Nasta","TI131/2", 3.20),
                new Student(1029,"Marius","Nasta","TI131/1", 5.12),
                new Student(1029,"Andrei","Dobrescu","TI131/2", 2.22)
        );

        //a
        StudentiExport strategyConsole = new StudentiInConsola();
        Export exporter = new Export();
        exporter.startExport(strategyConsole, studenti);

        //b
        System.out.println("---------------------------------");


        String fileName = "studentiStrategyText.txt";
        StudentiExport strategyFisierText = new StudentiInFisierTxt(fileName);
        exporter.startExport(strategyFisierText, studenti);

        //c

        System.out.println("------------------------------");

        String fileName2="studentiStrategyXlsx.xlsx";
        StudentiExport stratedyFisierText=new StudentiInFisierXlsx(fileName2);
        exporter.startExport(stratedyFisierText, studenti);

        //d

        System.out.println("-----------------------------");
        String fileNameImportTxt = "studentiStrategyText.txt";
        Import importFisierText = new Import();
        StudentiImport strategyImportTxt = new StudentiDinFisierTxt(fileNameImportTxt);
        List<Student> listaImportata = importFisierText.startImport(strategyImportTxt);

        //e

        System.out.println("-----------------------------");
        String fileNameImportXlsx = "studentiStrategyXlsx.xlsx";
        Import importFisierXlsx = new Import();
        StudentiImport strategyImportXlsx = new StudentiDinFisierXlsx(fileNameImportXlsx);
        List<Student> listaImportata2= importFisierXlsx.startImport(strategyImportXlsx);
    }
}
