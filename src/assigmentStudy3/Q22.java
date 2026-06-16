package assigmentStudy3;

//Write a program to print all numbers between 1 and 100 divisible by both 2 and 7.
public class Q22 {
    static void main(String[] args) {
        int a=1;   //initialization
        while (a<=100)  //condition
        {
            if (a%2==0 && a%7==0)
            {
                System.out.println("Between  1 to 100 numbers,divisible by 2 and 7 number is  "+a);
            }
            a++; //updation
        }
    }

}
