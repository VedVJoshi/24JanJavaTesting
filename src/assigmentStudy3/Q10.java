package assigmentStudy3;

//Write a program to find the final bill amount after discount:
//If > 5000 → 20% off, If > 2000 → 10% off, Else no discount.
public class Q10 {
    static void main(String[] args) {
        int amount=2500;
        if (amount>5000)
        {
            System.out.println("Up to 5000 - 20% discount");
        }
        else if (amount>2000)
        {
            System.out.println("Up to 2000 - 10% discount");
        }
        else
        {
         System.out.println("No discount for you");
        }
    }

}
