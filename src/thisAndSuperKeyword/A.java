package thisAndSuperKeyword;

public class A {
    //call global variable from same class
    int x=120;  //global variable
    int y=24;
    static int c=9;


    static void main(String[] args) {
        A a=new A();
        a.display();

    }
    public void display()
    {
        int x=12;   //local variable
        int sum=x+10; //local variable used
        System.out.println(sum);

        int sum1=this.x+10; //call global variable x or used
        System.out.println(sum1);
    }
}
