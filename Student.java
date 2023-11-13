public class Student extends User {
    String Major; //For simplicity we are calling this a String. We'd typically use a enum here.

    public Student(String FirstName, String LastName) {
        super(FirstName, LastName); 
    }
    
}
