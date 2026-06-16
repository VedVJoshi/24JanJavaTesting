package assigmentStudy3;

//Write a program to check whether a number is prime or not using for loop.
public class Q26 {
    static void main(String[] args) {
        int number =7;  //number we are check is prime or not
        int count =0; //for count how many number is divided

        for (int a=1;a<=number;a++ )  //loop for 1 to 7 because we are give the last number is 7
        {
            if (number % a==0)   //check the from 1-7 how many number are divide any no reminder
            {
                count++;       //check the who many number dividing the our input number
            }

        }
        if (count==2)      //prime number only two factor that divide
        {
            System.out.println("Number is prime"); //exactly have 2 factor is dividing then print this line.
        }
        else  //more then 2 number is divisible then else
        {
            System.out.println("Number is Not prime");
        }
    }
}
