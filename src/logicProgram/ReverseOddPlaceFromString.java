package logicProgram;

public class ReverseOddPlaceFromString {
    static void main(String[] args) {

        String name="Java Selenium Automation ";
        String rev="";

        String [] arr=name.split(" ");
        // System.out.println(arr[0]); //to see single elements that split in String [] arr

        for (int i=0;i<=arr.length-1;i++)
        {
            if (i %2 !=0)
            {
                String  temp =arr[i];

                for (int j=temp.length()-1;j>=0;j--)
                {
                    char te = temp.charAt(j);
                    rev=rev+te;
                }
                arr[i] = rev;
                // rev ="";   //if odd number name more than one than use --> Java ( Selenium--1st odd) Automation (Testing--2nd odd)
            }

        }

        for (int k=0;k<=arr.length-1;k++)
        {
            System.out.print(arr[k]+" ");
        }
    }
}
