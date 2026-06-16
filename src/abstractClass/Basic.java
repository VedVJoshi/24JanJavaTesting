package abstractClass;

public abstract class Basic {
    public static void main(String[] args) {
       // Basic basic=new Basic(); //show error because of abstract method
                                //complier don't want to create the object because of abstract method in class
                                //if object is not create then we can not call the methods
                                //static do not support the abstracts name in method
        data4(); //static can possible --> direct call
    }
    public void data1() //complete non-static method
    {
        System.out.println("data 1 method");
    }
    public void data2()  //no write code but have body --> complete method
    {

    }
    public abstract void data3();   //after abstract the method show no error but class name also
                                    //changed to abstract class and method name also
                                    //two options --> can give body OR abstract name -->In non-static method

    public static void data4()   //complete method because of have body
    {

    }

    // public static void data5(); // error because static can not use abstract
                                    //we can not give abstract to static method
                                   //only can give body

}
