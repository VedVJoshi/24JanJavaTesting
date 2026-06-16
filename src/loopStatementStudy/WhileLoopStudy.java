package loopStatementStudy;

public class WhileLoopStudy {
    static void main(String[] args) {

        //i want print Hello Sir 6 time
        //initialization 1  condition <=6  updation ++
        int a=1; //initialization
        while (a<=6)  //condition
        {
            System.out.println("Hello Sir");

            a++; //updation
        }

        System.out.println("===================================");

        //i want to print table of 9
        //initialization 9    condition <=90    updation +9  (variableName= variableName +9)
        int d=9;  //initialization
        while (d<=90)  //condition
        {
            System.out.println(d);
            d=d+9;  //updation
        }

        System.out.println("===================================");

        //i want print table of 9 in reverse case
        //initialization 90    condition >=9     updation  -9   (variableName= variableName -9)
        int f=90; //initialization
        while (f>=9)  //condition
        {
            System.out.println(f);
            f=f-9; //updation
        }

    }
}
