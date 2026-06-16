package logicProgram;

public class CountNumberOfWhiteSpace {
    public static void main(String[] args) {
        //count the space between the string
        String a=" V E D A N T  J O S H I ";

        int count=0; //count of space is zero then change in loop
        for (int i=0;i<=a.length()-1;i++)
        {
            char temp=a.charAt(i);
            if (temp == ' ') //here also give space
            {
               count++;
            }
        }
        System.out.println("Number of white space we have "+count);
    }
}
