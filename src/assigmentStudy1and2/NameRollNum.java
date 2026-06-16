package assigmentStudy1and2;

public class NameRollNum {
    static void main(String[] args) {

     //Write a program with a non-static method that prints your roll number and call it using an object.

        NameRollNum nameRollNum= new NameRollNum();
        nameRollNum.data(); //calling non-static method
    }

    public void data()
    {
        int rollNumber = 21;
        System.out.println("My roll Number is "+rollNumber);

    }
}
