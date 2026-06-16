package interfaceStudy;

public interface Mother {

    void nature();

    void look();


    //if same method
    //option-->
    // 1)Do method default and give body and definitions
//    default void love()
//    {
//        System.out.println("Mother Love default method");
//    }


    //option -->
    //2) do that same method static and give body and definition
    static void love()
    {
        System.out.println("Mother Love Static Method");
    }
}

