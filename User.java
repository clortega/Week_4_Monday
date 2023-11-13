import java.util.ArrayList;

public class User {
    
    String FirstName;
    String LastName;

    public User(String FirstName, String LastName) {
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    public void PrintNames()
    {
        System.out.println("User Name: " + FirstName + " " + LastName);
    }


}
