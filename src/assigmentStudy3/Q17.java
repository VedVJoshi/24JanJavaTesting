package assigmentStudy3;

//Write a program to calculate the sum of first 10 natural numbers using while loop.
public class Q17 {
    static void main(String[] args) {
        int a=1;  //start number from 1
        int sum=0;  //store result loop result

//        while (a<=10)  //loop until 10
//        {
//            sum=sum+a;  //add the number in sum
//            a++;       //increase by one
//            System.out.println("Sum of 1 to 10 natural number "+sum);
//        }

        for (int i=1;i<=10;i++)
        {
            sum=sum+i;
            System.out.println(sum);

        }


    }
}
