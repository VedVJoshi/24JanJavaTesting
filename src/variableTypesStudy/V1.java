package variableTypesStudy;

public class V1 {

    static void main(String[] args) {

        V v=new V();    //created object of V class (another class) for using V class global variable
        int div=81/v.a; //objectName.variableName
                        // 81/9 here// non-static calling global variable from object reference
        System.out.println("div of non static global variable from another class is "+div);

        int div1=V.b/2;  //I did 9/2 here , take non-static variable by divide 2
        System.out.println(div1);

        int mul=85*V.b;  //Calling static global variable from another class
                          //MethodName.varibleName
        System.out.println("Multiplication of static global variable from another class is "+mul);

    }

}
