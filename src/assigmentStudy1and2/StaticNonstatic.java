package assigmentStudy1and2;

public class StaticNonstatic {

    // Write a program to demonstrate static and non-static method calls in the same class

    static void main(String[] args) {
        //calling non static method in same class
        StaticNonstatic staticNonstatic=new StaticNonstatic();
        staticNonstatic.body();

        //calling static method in same class
        student();
    }

    public static void student()
    {
        String name = "Vedant";
        System.out.println(name);
    }

    public void body()
    {
        double weight= 72.56d;
        System.out.println(weight);
    }
}
