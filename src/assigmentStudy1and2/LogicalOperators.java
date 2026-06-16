package assigmentStudy1and2;

public class LogicalOperators {
   // Write a program using logical operators (&&, ||, !) in if conditions.

    static void main(String[] args) {
        // Favorite words
        char favorite='C';
        if (favorite=='A' || favorite=='B' || favorite=='C' || favorite=='D')
        {
            System.out.println("Favorite charter of me");
        }

        int marks =65;
        if (marks>55 && marks<70)
        {
            System.out.println("You have grade B");
        }
    }
}
