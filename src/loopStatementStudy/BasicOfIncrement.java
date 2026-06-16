package loopStatementStudy;

public class BasicOfIncrement {
    static void main(String[] args) {

        // 1) Post Increment --> variableName++  //
        //menas first assign then post increment

        int a = 58;
        // a value assign

        int x = a++; //gave a value to x then post increment
        System.out.println("value of A is " + a); // value of a is 59
        System.out.println("value of X is " + x);  //value of b is 58

        // int x=a++; means the first a value assign to x means--> a=58 value direct assign to x=58
        // then a++ means post increment in a value add a=59

        System.out.println("=========================================");


        // 2) Pre Increment --> ++variableName //
            //menas first increment then assign
        int p = 100;
        int l= ++p; //first increment change value (++) then assign to variable l

        System.out.println("value of p "+p); // value is p 101
        System.out.println("value of l is "+l); //value is l is 101

        //here first is increment and then assign
        // p value is 100 first incremant then value of a = 101
        // then a value assign to b (b=101)



    }
}
