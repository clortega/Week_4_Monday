import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{ //here we provide the comparator with the Student type.
    @Override
    public int compare(Student student1, Student student2) {
        return student1.FirstName.compareTo(student2.FirstName);
    }
}
