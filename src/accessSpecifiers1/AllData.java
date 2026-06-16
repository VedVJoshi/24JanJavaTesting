package accessSpecifiers1;

import accessSpecifiers.Data;

public class AllData extends Data {
    static void main(String[] args) {
        Data data=new Data();
        // data.test1(); cant call private method
        // data.test2(); cant call default method
        //  data.test3(); call after create the extends --> AllData extends Data and object want is super/parent class
        data.test4(); //public can call after import
        System.out.println(data.d); //default variable

        //after extends all method can call form AllData Class object
        //after public class AllData extends Data
        //create object of DataAll Class to call protected method
        AllData allData=new AllData();
        allData.test3(); //protected method call
        System.out.println(allData.c); //protected variable call

        //after extends we can call public method and variable from object AllData Class
        allData.test4(); //public method
        System.out.println(allData.d); //public variable


        //after extends AllData extends Data
        int sum=10+Data.x; //static int X=15 --> call after public access specifier
        //after public, we call it direct ClassName and variable name
    }
}
