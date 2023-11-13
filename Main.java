import java.util.ArrayList;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) { //The entry point
        B b = new B();
        
        // Triangle = triangle = new Triangle(100, 3);
        // double area = triangle.getArea();
        // System.out.println("area " + area);

        // Circle c = new Circle();
        // Rectangle r = new Rectangle();

        // IsShape(r);
        // IsShape(c);
        // IsShape(triangle);
        // IsShape(null);

        // public static void IsShape(Shape shape) {
        //     if(shape instanceof Shape) {
        //         System.out.println("This is a shape!");
        //     } else {
        //         System.out.println("This is not a shape");
        //     }
        // }
        
    }

    public static void StudentLogic() {
        Student student1 = new Student("Melissa", "Hegney"); //creates an instance of Student, student1
        // student1.Major = "IT";
        Student student2 = new Student("Peter", "LastName");
        Student student3 = new Student("Sky", "Hegeney");
        Student student4 = new Student("Eric", "Cifuentes");

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        for(Student student: students){
            student.PrintNames();
        }
        students.sort(new StudentComparator())
;
System.out.println("After Sort Completed");
        for(Student student: students){
            student.PrintNames();
        }
    }
}