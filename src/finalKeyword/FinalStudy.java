package finalKeyword;

public class FinalStudy {  //after do class final class can not inherit or share property
    static void main(String[] args) {

        int a=10; //now a value is  10
        a=a+10;  //reinitialization value can change value is change to 20
        System.out.println(a);

        final int b=9;
        System.out.println(b);
//        b=b+1;                        //we cant re initialization value of final keyword variable/method value
//        System.out.println(b);

        FinalStudy finalStudy=new FinalStudy();
        finalStudy.test1();
        finalStudy.test2();
        finalStudy.test3();

    }
    public void test1()
    {
        System.out.println("test 1 method from final study class public method");
    }
    final void test2()
    {
        System.out.println("test 2 from final study class final method");
    }
    private void test3()
    {
        System.out.println("test 3 from final study class private method");
    }

}
