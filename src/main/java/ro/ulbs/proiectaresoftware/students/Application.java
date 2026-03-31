package ro.ulbs.proiectaresoftware.students;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Application
{
    public static void main(String[] args)
    {
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
        HashMap<Integer, Student> bursieri = new HashMap<>();
        bursieri.put(new StudentBursieri(1025,"Andrei","Popa","ISM141/2",8.70,725.50));

    }
}
