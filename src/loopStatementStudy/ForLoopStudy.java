package loopStatementStudy;

public class ForLoopStudy {
    static void main(String[] args) {

        //i want print good morning 10 times
        // initialization (start)= 1 ; condition = <=10 ; Updation = ++

        for (int c=1; c<=10; c++)
        {
            System.out.println("Good Morning Pineapple");
        }

        System.out.println("========================================");

        //table of 5
        //intilization = 5 ; condition = <=5; updation = (variableName = variableName + number)
        for (int a=5; a<=50; a=a+5)
        {
            System.out.println(a);
        }

        System.out.println("========================================");


        // Reverse table of 12
        // intilization=120; updation = <=12; condition = variableName  = variableName + Number)
        for (int p=120; p>=12; p=p-12)
        {
            System.out.println(p);
        }
    }
}
