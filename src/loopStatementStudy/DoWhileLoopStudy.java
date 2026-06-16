package loopStatementStudy;

public class DoWhileLoopStudy {
    static void main(String[] args) {
        //i want to print Hello Dada for 3 time
        //initialization 1   condition <=3   updation ++

        int x=1;  //initialization
        do {
            System.out.println("Hello dada");
            x++;  //updation
        }while (x<=3);  //condition

        System.out.println("=================================");

        //i want to print table of 7
        //initialization 7    condition <=70    updation +7
        int k=7;  //initialization
        do {
            System.out.println(k);
            k=k+7;  //updation
        }while (k<=70);  //condition

        System.out.println("=================================");

        // i want to print table of 7 in reverse case
        //initialization 70    condition >=7   updation  -7
        int s=70;  //initialization
        do {
            System.out.println(s);
            s=s-7;  //updation

        }while (s>=7); //condition
    }
}
