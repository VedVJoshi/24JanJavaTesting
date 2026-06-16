package casting;

public class CastingFamily {
    static void main(String[] args) {

        Father father=new Father();
        father.bike();
        father.car();
        father.nature();

        System.out.println("=====================================");

        Son son=new Son();
        son.bike();
        son.car();
        son.education();

        System.out.println("=======================================");

        System.out.println("==========Casting======================");

        Father temp=new Son();  //type of Father But temp is Object of Son();
        temp.bike();
        temp.car();
        temp.nature(); //we not override but after extends all father method are in son class

    }
}
