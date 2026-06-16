package stringStudy;

public class StringMethod {
    static void main(String[] args) {

        //1. length method --> length();
        String a="Velocity";
        System.out.println(a.length()); //--> Only print--> not store value
        //store value -->
        int Stringlength=a.length();  //data type used int for save value in StringLength
        System.out.println("Length of String is "+Stringlength);

        String a1="  ";
        System.out.println(a1.length()); //--->output 2 because of two space blank size have count
        System.out.println(a1); //--> output is blank


//        String a2=null;
//        System.out.println(a2.length()); //runtime error-->NullPointerException
        System.out.println("===========================================================");

//*************************************************************************************************************
        //2.toUpperCase();
        String b1="Vedant";
        String upperCase=b1.toUpperCase();  //date type is String
        System.out.println(upperCase);

        //3.toLowerCase();
        String lowerCase=b1.toLowerCase();  //date type is String
        System.out.println(lowerCase);
        System.out.println("===========================================================");

//**************************************************************************************************************
        //4.equals();
        String c1="Vedant";
        String c2="Vedant";
        String v=new String("Vedant");
        String v1=new String("Joshi");
        String v2=new String("Joshi");

        System.out.println(c1.equals(v)); //--> true (inner content are same and equals check inner content)

        System.out.println(c1.equals(c2));  //true
        System.out.println(c1.equals(v1));  //false
        System.out.println(c2.equals(v2));  //false
        System.out.println(v1.equals(v2));  //true
        System.out.println("===========================================================");

//**************************************************************************************************************
        //5.equalsIgnoreCase
        //check equals but ignore case
        String x="Bhaiyya";
        String x1="bhaiyya";;
        System.out.println(x.equalsIgnoreCase(x1)); // --> true
        System.out.println("===========================================================");

//**************************************************************************************************************
        //== --> check memory location
        System.out.println(c1==c2); //--> true same memory from same constant pool in same memory //only check memory Location
        System.out.println(v1==v2); //-->false same pool non-constant but new keyword used v1 and v2 location change in memory
                                    //new keyword assign new memory for each object
        System.out.println(c1==v1); //--> false --> c1 is constant pool memory
                                    // v1 from non-constant pool memory
        System.out.println(v==c1);  //false --> their location is different pool
        System.out.println("===========================================================");

//**************************************************************************************************************
        //6.contains()

        String d1="Katraj";
        boolean result=d1.contains("aj");   //give sequence name then true
        System.out.println(result);

        System.out.println(d1.contains("Ka"));  //here is given sequence --> true
        System.out.println(d1.contains("Kt"));  //ta is not in characters sequence --> false

        String d3= " ";   //no value enter
        d3.contains("t");  //it no output show because of no value t is not in sequence
        System.out.println(d3);
        System.out.println("===========================================================");


//**************************************************************************************************************
        //7.isEmpty()

        String d4=""; //no space it is empty
        boolean show=d4.isEmpty();
        System.out.println(show); // -->true

        String d5="  ";  //space have here
        System.out.println(d5.isEmpty()); //--> false

        String d6="a"; //given one character --> empty is for show empty or not
        System.out.println(d6.isEmpty()); //--> false
        System.out.println("===========================================================");

//**************************************************************************************************************
        //7.isBlank()

        String e1=" ";
        String e2="";
        String e4="text";

        System.out.println(e1.isBlank()); //--> here have one space but in isBlank that is allowed --> true
        System.out.println(e2.isBlank()); //--> here no space but this is empty that is allowed in isBlank()--> true
        System.out.println(e4.isBlank()); //--> here there are text value have in isBlank() not allowed --> false
        System.out.println("===========================================================");

//**************************************************************************************************************
        //8.charAt()

        String f1="Velocity Testing";
        System.out.println(f1.charAt(9)); //--> at 9 there are -->Output is T
        System.out.println(f1.charAt(8)); //at 8 there are space --> output is --> blank
        System.out.println(f1.charAt(10)); // at 10 --> e is here

        String f2="Vedant Joshi";
        char result3=f2.charAt(7);
        System.out.println(result3);
        System.out.println("===========================================================");

//**************************************************************************************************************
        //9.endWith()-->

        String g1="Selenium";
        String g2= "java";
        String g3= "testing";

          //for store value-->
        boolean result4=g2.endsWith("va");
        System.out.println(result4);

        System.out.println(g1.endsWith("ium")); //true--> ends with ium
        System.out.println(g1.endsWith("m"));   //true--> ends with m
        System.out.println(g1.endsWith("Selenium")); //true--> full name but ends with is right
        System.out.println(g1.endsWith("ni"));  //false not end with ni

        //10.startsWith()
          //for store value-->
        boolean result5=g3.startsWith("tes");
        System.out.println("result 5 is "+result5);

        System.out.println(g1.startsWith("Sel")); //true--> starts with Sel
        System.out.println(g1.startsWith("ele")); //false --> not starts with ele
        System.out.println("===========================================================");

//**************************************************************************************************************
        //11.subString

        String h1="Velocity Corporate Testing Center";
        //option 1--> enter beginning number print all to end
        System.out.println(h1.substring(9));//from 9 to end

        //option 2--> ether beginning number and End number
        System.out.println(h1.substring(9,26));  //only end number add +1 in the number

        String x3=h1.substring(19);
        System.out.println(x3);
        System.out.println("===========================================================");

//**************************************************************************************************************
        //12.concat()

        String i1="Java";
        String i2="Testing";
        String i3=i1.concat(i2); //-->store value --> concat connect the that two words
        System.out.println(i3); //--> Output is --> JavaTesting (No space)

        //for space -->
        System.out.println(i1.concat(" ").concat(i2)); //now Output is -->Java Testing

        //for do Java Selenium Testing-->
        System.out.println(i1.concat(" ").concat("Selenium ").concat(i2)); //now Output is--> Java Selenium Testing
        System.out.println("===========================================================");

//**************************************************************************************************************
        //13.indexOf()-->
        //14.lastIndexOf()-->

        String j1="Mahabaleshwar";
        int result6=j1.indexOf('l'); // 'l' location in index is -->6
        System.out.println(result6);

        System.out.println(j1.indexOf('z')); //output come --> -1 because the z is wrong parameter
                                             //Any number come in -1 means this is wrong parameter

        String j2="testing";
        System.out.println(j2.indexOf('t'));//output--> 0 . // here 2 't' here, but indexOf show first come in string/name

        //but we want that 2nd 't'-->
        System.out.println(j2.lastIndexOf('t')); //output --> 3 because not lastIndexOf means from last which is t there

        String j3="enginieering";  //i want index of middle 'i'
        System.out.println(j3.indexOf('i',4)); //i want 'i',and start from 4th index
                                           //output is--> 5 and there are 'i'

        //for sequence "in" index
        System.out.println(j3.indexOf("in")); //"in" starts from which index
                                           //output is --> 3

        String j4="engineeeringe"; //i want middle 'e' index
        System.out.println(j4.indexOf('e',6,8)); // 6 is 'e'
                                            //output--> 6 (on 6 middle e have)
        System.out.println("===========================================================");

//**************************************************************************************************************
        //15.replace

        String k1="testing";
        String result7=k1.replace('t','b'); //replace 't' to 'b'
        System.out.println(result7); //output--> besbing

        String k2="engineering";  //replace "in" to "yt"
        System.out.println(k2.replace("in","yt")); //output--> engyteerytg

        //In k2= engineering first in replace uu -->
        System.out.println(k2.replaceFirst("in","uu")); //output --> enguueering (change only first in to uu)

        //replaceAll
        String k3="engineering 2023";
        System.out.println(k3.replaceAll("engineering 2023","BSC 2024"));
        System.out.println("===========================================================");

//**************************************************************************************************************
        //16.split

        String name="Java Selenium tool study";

        String[] cut =name.split(" ");
        System.out.println(cut.length);


        String name1="Vedant_Vijaykumar_Joshi";
        String[] cut1=name1.split("_");
        System.out.println(cut1.length);

        String name2="Velocity&Coroporate&Traning&Center&Vimannagar&Pune";
        String[] cut2=name2.split("&");
        System.out.println(cut2.length);



    }
}
