package controlStatement;

public class NestedIfElse {
    static void main(String[] args) {

        //Username is correct --> Please enter password
        //if password is correct --> Login successful Home page
        //else is incorrect --> please enter valid password
        //else username is incorrect --> your username is incorrect

        String username = "Vedant";      //giving value by user
        String password = "Vedant@123";

        if (username=="Vedant")
        {
            System.out.println("Username is correct");
            if (password=="Vedant@123")
            {
                System.out.println("Password is successful--> Home page");
            }
            else
            {
                System.out.println("Password is incorrect Login fail");
            }
        }
        else
        {
            System.out.println("Username is incorrect");
        }


    }
}
