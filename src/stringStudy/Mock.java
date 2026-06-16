package stringStudy;

public class Mock {
    static void main(String[] args) {
        //length()-->
        String a1="LENGTH";
        int result=a1.length();
        System.out.println(result);

        //uppercase()-->
        System.out.println(a1.toUpperCase());

        //lowercase()-->
        System.out.println(a1.toLowerCase());
        System.out.println("**************************************************");

        //equal()-->
        String b1="Vedant";
        String b2="vedant";
        String b3="Vedant";
        String b4="Joshi";
        System.out.println(b1.equals(b2));
        System.out.println(b1.equals(b3));
        System.out.println(b1.equals(b4));

        //equalsIgnoreCase()-->
        System.out.println(b1.equalsIgnoreCase(b2));
        System.out.println("**************************************************");

        //contains()-->
        String c1="Pathardi city";
        boolean result3=c1.contains("t");
        System.out.println(result3);

        System.out.println(c1.contains("tha"));
        System.out.println(c1.contains(" "));
        System.out.println(c1.contains("q"));
        System.out.println("**************************************************");

        //empty()-->
        String d1="";
        boolean result4=d1.isEmpty();
        System.out.println(result4);

        String d2=" ";
        System.out.println(d2.isEmpty());

        String d3="class";
        System.out.println(d3.isEmpty());

        //isBlank()-->
        String d4="";
        boolean result5=d4.isBlank();
        System.out.println(result5);

        String d5="    ";
        System.out.println(d5.isBlank());
        System.out.println("**************************************************");

        //charAt()-->

        String e1="Vedant";
        char result6=e1.charAt(3);
        System.out.println(result6);

        //System.out.println(e1.charAt(18)); --> exception
        // System.out.println(e1.charAt(-1)); --> exception
        System.out.println("**************************************************");

        //endsWith()-->
        //startsWith()-->
        String f1="Tata";
        String f2="Motors";

        System.out.println(f1.endsWith("ta"));
        System.out.println(f1.endsWith("at"));

        System.out.println(f2.startsWith("M"));
        System.out.println(f2.startsWith("Mo"));

        System.out.println("**************************************************");
        //subString()-->
        String g1="Vedant Vijaykumar Joshi";
        System.out.println(g1.substring(7));

        System.out.println(g1.substring(7,17)); //middle name --> Vijaykumar
        System.out.println("**************************************************");

        //concat()-->
        String h1="Vedant";
        String h2="Joshi";

        String result7=h1.concat(" ").concat(h2);
        System.out.println(result7);

        //Mr. Vedant Vijaykumar Joshi-->
        String result8=("Mr ").concat(h1).concat(" ").concat("Vijaykumar ").concat(h2);
        System.out.println(result8);  //--> Mr Vedant Vijaykumar Joshi

        System.out.println("**************************************************");

        //indexOf()-->
        String i1="Katraj";
        System.out.println(i1.indexOf('t'));

        System.out.println(i1.indexOf('x')); //-1--> means wrong parameter

        System.out.println(i1.indexOf('a'));

        System.out.println(i1.lastIndexOf('a'));

        String i2="innnocent";
        System.out.println(i2.indexOf('n',2));//1 is n but we want 2rd --> 'n' --> fromindex : 2

        System.out.println(i2.indexOf('n',2,4)); //2 is e output --> 2
        System.out.println("**************************************************");

        //replace()-->
        String j1="Selenium";
        String result9=j1.replace("le","tem");
        System.out.println(result9);

        System.out.println(j1.replace('S','T'));

        //replaceAll()-->
        String k1="Engineering 2023";
        String result10=k1.replace("2023","2026");
        System.out.println(result10);

        System.out.println(k1.replace("Engineering 2023","BSC 2023"));












    }
}
