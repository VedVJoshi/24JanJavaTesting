package logicProgram;

public class RevEx {
    static void main(String[] args) {

        String name1="Java Selenium Testing";
        String reverse="";
        String[] name=name1.split(" ");

        for (int i=0;i<=name.length-1;i++)
        {
            if (i % 2==0 || i%2 !=0)
            {
                String te =name[i];
                for (int j=te.length()-1;j>=0;j--)
                {
                    char temp =te.charAt(j);
                    reverse=reverse+temp;
                }
                name[i]=reverse;
                reverse="";
            }
        }

        for (int k=0;k<=name.length-1;k++)
        {
            System.out.print(name[k]+" ");
        }
    }
}
