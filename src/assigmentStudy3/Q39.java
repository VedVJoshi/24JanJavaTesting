package assigmentStudy3;

//Write a program to demonstrate the use of continue in a loop (skip number 5).
public class Q39 {
    static void main(String[] args) {
       for (int a=1;a<=10;a++)
       {
           if (a==5)
           {
               continue; //if when a=5 is come then if will chack a come 5 and continue will skip 5
           }
           System.out.println(a);
       }
    }
}
