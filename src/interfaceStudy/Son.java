package interfaceStudy;

public class Son implements Father,Mother{

    static void main(String[] args) {
        Son son=new Son();
        son.hardwork();  //Father class method completed
        son.honesty();  //Father class method completed
        son.look();     //Mother class method completed
        son.nature();   //Mother class method completed
        //  son.love();  //Father and Mother call (Completed in their Interface class because of same name)

        //if de do static that method and give body --> static call directly
        Father.love();
        Mother.love();

    }

    @Override
    public void hardwork() {
        System.out.println("Father Hardwork completed in Son class");
    }

    @Override
    public void honesty() {
        System.out.println("Father Honesty Completed in Son class");
    }

//    @Override
//    public void love() {  //this is only father method mother is not created
//        Father.super.love();  //we do default method both and give body
//        Mother.super.love();  //and call here directly
//    }

    @Override
    public void nature() {
        System.out.println("Mother Nature Completed in Son Class");
    }

    @Override
    public void look() {
        System.out.println("Mother looks Completed in Son Class");

    }
}
