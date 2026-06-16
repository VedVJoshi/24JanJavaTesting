package accessSpecifiers;

public class Data {

    //private
    //default
    //protected
    //public

    private int a=12;
    int b=15;   //default
    protected int c=21;
    public int d=55;
    public static int x=15;

    static void main(String[] args) {
      //all method are non-static so have to create object
      Data data=new Data();
      data.test1();     //all method in same class so all call here in same class
      data.test2();
      data.test3();
      data.test4();

      int sum1=45+ data.a;
      int sum2=11+ data.b;
      int sum3=10+data.c;
      int sum4=2+data.d;
      System.out.println(sum1);
      System.out.println(sum2);
      System.out.println(sum3);
      System.out.println(sum4);
    }

    private void test1()
    {
        System.out.println("This A class method test 1");
    }
    void test2()
    {
        System.out.println("This A class method test 2");
    }
    protected void test3()
    {
        System.out.println("This A class method test 3");
    }
    public void test4()
    {
        System.out.println("This A class method test 4");
    }
}
