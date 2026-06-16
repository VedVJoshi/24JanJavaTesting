package controlStatement;

public class SwitchCaseStudy {
    static void main(String[] args) {



    //1st winner --> gold medal
    //2nd winner --> silver medal
    //3rd winner --> bronze medal

    int winner = 52;
    switch (winner)
    {
        case 1 : System.out.println("Gold medal is yours");
        break;

        case 2 : System.out.println("Silver medal is yours");
        break;

        case 3 : System.out.println("Broze medal is yours");
        break;

        default: System.out.println("Thank you You are not in winner list");
    }

        //Grade is A = Excellent
        //Grade is B = Very Good
        //Grade is C = Good
        //Grade is D = Pass

        char grade='A';
        switch (grade)
        {
            case 'A' : System.out.println("Excellent Job");
            break;

            case 'B' : System.out.println("Very Good Job");
            break;

            case 'C' : System.out.println("Good Job");
            break;

            case 'D' : System.out.println("Not Good But Pass");
            break;

            default: System.out.println("Please enter valid grade");
            break;
        }

        //action for save commond --> saving file
        //action for load commond --> loading file
        //action for exit commond --> exiting file
        // not a valid commond

        String commond= "load";
        switch (commond)
        {
            case "save" : System.out.println("saving file");
            break;

            case "open" : System.out.println("Opening file");
            break;

            case "load" : System.out.println("Loading file");
            break;

            case "exit" : System.out.println("Exiting file");
            break;

            default: System.out.println("Not valid commond");
        }
  }
}
