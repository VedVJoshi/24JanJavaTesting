package accessSpecifiers;

public class StudyData {
    public static void main(String[] args) {
        //call Data class method to this class

        Data data=new Data();
        // data.test1();  //test 1 is private we cannot call private method
        data.test2();    //default can call in package in any class
        data.test3();    //protected can call in package in any class / if imports use we can call in another package
        data.test4();    //public we can call anywhere in project in package or another package

       // int sum1=45+ data.a;  private doesn't call in another class also because that is private
        int sum2=11+ data.b;
        int sum3=10+data.c;
        int sum4=2+data.d;
      //  System.out.println(sum1); //priavte
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);

    }
}
