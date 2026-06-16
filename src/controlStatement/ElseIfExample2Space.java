package controlStatement;

public class ElseIfExample2Space {
    static void main(String[] args) {
        //marks is 10
        //A --> 8>= and =<9                       //AND
        //B --> 7>= and =<8                        //2 condition are true then it is true
        //C --> 6>= and  =<7                       // 1 condition is true then output is false
        //D --> 5>= and =<6

        int marks = 4;
        if (marks >=8 && marks <=9)
        {
            System.out.println("you got grade A");
        }
        else if (marks >=7 && marks <=8)
        {
            System.out.println("You got grade B");
        }
        else if (marks >=6 && marks <=7)
        {
            System.out.println("You got grade C");
        }
        else if (marks >=5 && marks <=6)
        {
            System.out.println("You got grade D");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
