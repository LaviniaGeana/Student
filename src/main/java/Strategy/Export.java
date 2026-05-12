package Strategy;

import ro.ulbs.proiectaresoftware.students.Student;

import java.util.List;

public class Export
{
    public void startExport(StudentiExport strategyInstance, List<Student> students)
    {
        strategyInstance.doExport(students);
    }
}
