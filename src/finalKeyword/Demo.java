package finalKeyword;

public class Demo extends FinalStudy{
    static void main(String[] args) {
        Demo demo=new Demo();
        demo.test1(); //public method
        demo.test2(); //final method from super class only inherit after extends, but we can not overload
        //demo.test3();error --> not call private method

    }
    public void test1()
    {
        System.out.println("test 1 class from Demo class");
    }
//    public void test2()   //final method can not be overridden only inherit to allow--> calling in main method
//    {
//        System.out.println("test 2 method from Demo class ");
//    }
}
