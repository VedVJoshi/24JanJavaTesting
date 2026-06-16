package exceptionStudy;

public class SeniorCitizenWork {
    static void main(String[] args) {

        int age=69;
        if (age > 65)
        {
            throw new SeniorCitizenException("Not Allow to work TAKE REST");
        }
    }
}
