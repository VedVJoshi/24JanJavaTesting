package assigmentStudy3;

//Write a program to demonstrate the use of break in a loop (stop when number = 5).
public class Q38 {
    static void main(String[] args) {
        for (int a=1;a<=10;a++)  //loop start with 1 to 10
        {
            if (a==5)            //when a==5 then it will stop the loop
            {
                break;          //break stop after a==5 then exit the loop
                                //1-4 print and 5 stop
            }
            System.out.println(a);

        }

    }
}
