package loopStatementStudy;

public class BasicsOfDecrement {
    static void main(String[] args) {

        // 1) Post Decrement -->  syntax is  variableName--    (-- = decrement)
          //first assign and then decrement

        int r =65;  //assign r with value
        int s= r--;

        System.out.println("value of s is "+s); //first r give value to s that is 65 output is s value is 65
        System.out.println("value of r is "+r);   // then decrement will done output - r value is 64

        System.out.println("=========================================");

        // 2) Pre Decrement -->  syntax is   --varoableName
           //first decreation and then assign

        int y= 99;
        int z= --y;
        //first value of y is decrement
        // then that value is assign to z

        System.out.println("value of y is "+y);  //first value decrement means value 99 change to 98 now (y=98)
        System.out.println("value of x is "+z);  //then assign the y value to z means now value of y is 98 after first value change
                                                  // means the value of z is now 98



    }
}
