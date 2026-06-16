package interfaceStudy;

public interface Father {

    void hardwork();

    void honesty();


    //if same method
    //option-->
    // 1)Do method default and give body and definitions
//    default void love(){
//        System.out.println("Father Love default method ");
//    }


    //option -->
    //2) do that same method static and give body and definition
    static void love()
    {
     System.out.println("Father Love Static Method");
    }
}
