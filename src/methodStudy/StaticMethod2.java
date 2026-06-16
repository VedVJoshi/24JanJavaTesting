package methodStudy;

public class StaticMethod2 {


    //static methods -->

    public static void b(){
        System.out.println("This is static method B ");
    }

    public static void c()
    {
        System.out.println("This is static method C");
    }

    //Non static methods -->

    public void testA()
    {
        System.out.println("This Non Static method test A From Another Class");
    }

    public void testB()
    {
        System.out.println("This is Non static method test B from Another Class");
    }
}
