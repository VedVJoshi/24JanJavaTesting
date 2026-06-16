package assigmentStudy3;

//Write a program using nested for loops to print diagonal elements in a 3×3 matrix using *.
//  *
//    *
//      *
public class Q37 {
    static void main(String[] args) {
        //outer loop for rows
        for (int a=1;a<=3;a++)
        {
            //inner loop for columns
            for (int b=1;b<=3;b++)
            {
                //condition for diagonal (tirpi line)
                if (a==b)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            //for change the line
            System.out.println();
        }
    }

}
