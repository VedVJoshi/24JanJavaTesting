package exceptionStudy;

public class VotingQualificationAge {
    static void main(String[] args) {

        int age=15;

        if (age<18)
        {
            throw new InValidAgeException("You are not for VOTING");
        }


    }
}
