package polymorphism;

public class Sample {
   static void main(String[] args) {
         main();
         main("dyya");
         a(45);

         Sample sample=new Sample();
        String result=sample.bata().toUpperCase();
    }
    public static void main()
    {
        System.out.println("main method zero parameter Sample class");
    }

    public static void main(String city)
    {
        System.out.println("main method single parameter string Sample class "+city);
    }

    public static void a(int a)
    {
        System.out.println("static method int parameter Sample class "+a);
    }
    public static void a()  //overloading a() and a(int a) method both are same different parameter
    {

    }
    private String bata()
    {
        String a="test";
        return a;

        //method name is b--> but return type is change to String

        //private String b() and private void b() are same method name  that error will show
    }
//    private void b()  //error will come because of same method name of private String b()
//    {
//        System.out.println("non static method b IN sample class");
//    }

    private void display()
    {
        System.out.println("private");
    }

}
