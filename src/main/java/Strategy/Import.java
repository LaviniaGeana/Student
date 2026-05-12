package Strategy;

import ro.ulbs.proiectaresoftware.students.Student;
import java.util.List;

public class Import {

    public List<Student> startImport(StudentiImport strategyInstance)
    {
        return strategyInstance.doImport();
    }
}