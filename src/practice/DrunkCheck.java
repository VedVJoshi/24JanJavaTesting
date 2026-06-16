package practice;

public class DrunkCheck {
    static void main(String[] args) {

        int DrunkLimit=1500;
        if (DrunkLimit>1000)
        {
            throw new DrinkLimitException("You Are Drunk Give FINE");
        }
        else
        {
            System.out.println("You Can Go..THANK YOU");
        }
    }
}
