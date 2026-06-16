package stringStudy;

public class StringBufferBuilderStudy {
    static void main(String[] args) {

        String name="Velocity";
        System.out.println(name);
        name=name+" Testing";
        System.out.println(name);

        System.out.println("==============================================");

        StringBuffer city=new StringBuffer("Pune");

        city.append(" Shivaji Nagar");
        System.out.println(city);

        city.replace(0,1,"p");
        System.out.println(city);

        System.out.println(city.reverse());


        System.out.println("==============================================");

        StringBuilder gender=new StringBuilder("Male");

        gender.append(" Gender");
        System.out.println(gender);

        gender.insert(5,"Female ");
        System.out.println(gender);

        gender.delete(5,12);
        System.out.println(gender);





    }
}
