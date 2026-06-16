package assigmentStudy3;
//Write a program using nested for loops to print a 3×3 grid of stars (* * *).
public class Q30 {
    static void main(String[] args) {

        for (int a=1;a<=3;a++)  //rows
        {
            for (int b=1;b<=3;b++){   //columns
                System.out.print("* ");   //here we used the only print not println
                                          //that's why change the line and we make the star square
            }
            System.out.println();
        }


    }
}
