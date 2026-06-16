package polymorphism;

public class Sample2 extends Sample {
    static void main(String[] args) {
        a(22); //direct call of test a
        Sample.a(211); //call the test a form Sample class with ClassName.MethodName
        Sample2 sample2=new Sample2();
        sample2.display();

//        Sample sample=new Sample();
//        sample.display();  //eroor --> private method of super class cant come subclass

    }
    public static void a(int a) //here we create the same method but static method cant override cant share
    {
        System.out.println("static method from Sample 1 class "+a);
    }
    private void display()
    {
        System.out.println("private method Sample 2");
    }
}
