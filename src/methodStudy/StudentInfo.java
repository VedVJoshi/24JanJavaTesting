package methodStudy;

public class StudentInfo {
    static void main(String[] args) {
        studentData();        //This is Zero parameter method calling
                              //This is static method that's why direct calling here

        //This is Static method
        //Calling multi parameter method
        studentData("Tilak Sharma",45,'C',89.39f,true);
        //Enter all value at time and we can use this multi time with another value
        studentData("vedant",24,'A',85.14f,true);

    }
    public static void studentData() {
        String name = "Surya";
        int rollNumber = 25;
        char div = 'A';
        float marks = 98.89f;
        boolean result = true;   //true is pass and false is fail

        System.out.println("=========================================");
        System.out.println("My name is " + name);
        System.out.println("MY RollNumber is " + rollNumber);
        System.out.println("My division is " + div);
        System.out.println("My Marks are " + marks);
        System.out.println("MY result is " + result);
        System.out.println("==========================================");
    }
    public static void studentData(String name,int rollNumber,char div,float marks,boolean result )
    {
        System.out.println("===================================");
        System.out.println("My name is "+name);
        System.out.println("My Roll Number is "+rollNumber);
        System.out.println("My division is "+div);
        System.out.println("My marks is "+marks);
        System.out.println("My result is "+result);
        System.out.println("=====================================");
    }

}
