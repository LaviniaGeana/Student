package ro.ulbs.proiectaresoftware.students;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Application
{
    public static void main(String[] args) {
        /*
        Student s1=new Student(112,"Ioan","Popa","TI21/1");
        Student s2=new Student(112,"Maria","Oprea","TI21/1");
        Student s3=new Student(120,"Alis","Popa","TI21/1");
        Student s4=new Student(122,"Mihai","Vecerdea","TI22/1");
        Student s5=new Student(122,"Eugen","Uritescu","TI22/1");

        //2.5.2
        //a.
        System.out.println(String.format("%15s %15s %15s %15s","numar matricol", "prenume", "nume", "formatieDeStudiu"));
        List<Student> list=new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        for(Student s:list)
            System.out.println(s);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);

         */
        System.out.println("---------------------------");
        /*
        Path path= Paths.get("studenti_in.txt");
        HashMap<Integer, Student> studentiMap = new HashMap<>();
        try(Scanner sc=new Scanner(path)){
            while(sc.hasNextLine()){
                int nrMatricol = sc.nextInt();
                String prenume = sc.next();
                String nume = sc.next();
                String formatieDeStudiu = sc.next();


                Student s = new Student(nrMatricol, prenume, nume,formatieDeStudiu);

                studentiMap.put(nrMatricol, s);
                System.out.println(sc.nextLine());
            }
        }catch (IOException e) {
            e.printStackTrace();
        }

        Path path2= Paths.get("note_anon.txt");
        try (Scanner sc = new Scanner(path2)) {

            while (sc.hasNext()) {
                int nrMatricol = sc.nextInt();
                float nota = sc.nextFloat();

                Student s = studentiMap.get(nrMatricol);

                if (s != null) {
                    s.setNota(nota);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();

        }
        */
        /*
       List<StudentBursieri> bursieri = new ArrayList<>();

       bursieri.add(new StudentBursieri(1025,"Andrei","Popa","ISM141/2",8.70F,725.50));
       bursieri.add(new StudentBursieri(1024,"Ioan","Mihalcea","ISM141/1",9.80F,801.10));
       bursieri.add(new StudentBursieri(1026,"AnaMaria","Prodan","TI131/1",8.90F,745.50));
       bursieri.add(new StudentBursieri(1029,"Bianca","Popescu","TI131/1",9.10F,780.80));

       SalvareInFisier("bursieri_out.txt",bursieri);

    }
    public static void SalvareInFisier(String fisier,List<StudentBursieri> bursieri)
    {
        try(FileWriter writer = new FileWriter(fisier)){
            for(StudentBursieri s:bursieri){
                writer.write(s.toString()+"\n");
            }
            System.out.println("Salvare in fisier");
        } catch (IOException e) {
            System.out.println("Eroare: "+e.getMessage());
        }
    }


        Set<Student> studenti = new HashSet<>();
        Student s1=new Student(112,"Ioan","Popa","TI21/1");
        Student s2=new Student(112,"Maria","Oprea","TI21/1");
        Student s3=new Student(120,"Alis","Popa","TI21/1");
        Student s4=new Student(122,"Mihai","Vecerdea","TI22/1");
        Student s5=new Student(122,"Eugen","Uritescu","TI22/1");

        //studenti = imparteInDouaFormatii(studenti, "TI 211_1", "TI 211_2");
      
        */
        /*
       System.out.println("-------------Lab9--------------");

       List<Student> studentiCuNote=Arrays.asList(

               new Student(1025,"Andrei","Popa","ISM 41/2",8.70),
               new Student(1024,"Ioan","Mihalcea","ISM141/1", 10),
               new Student(1026,"Anamaria","Prodan","TI131/1", 8.90),
               new Student(1029,"Bianca","Popescu","TI131/1,", 10),
               new Student(1029,"Maria","Pana","TI131/2,", 4.10),
               new Student(1029,"Gabriela","Mohanu","TI131/2,", 7.33),
               new Student(1029,"Marius","Nasta","TI131/2,", 3.20),
               new Student(1029,"Marius","Nasta","TI131/1,", 5.12),
               new Student(1029,"Andrei","Dobrescu","TI131/2,", 2.22)

       );

        List<Student> studentiNota10 = studentiCuNote.stream()
                .filter(s -> s.getNota() == 10)
                .collect(Collectors.toList());
        System.out.println("a) "+studentiNota10);

        List<Student> studentiNota5=studentiCuNote.stream()
                .filter(s -> s.getNota() <5)
                .collect(Collectors.toList());
        System.out.println("b) "+studentiNota5);

    */











    }


}
