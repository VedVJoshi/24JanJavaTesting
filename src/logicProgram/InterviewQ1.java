package logicProgram;

public class InterviewQ1 {
    static void main(String[] args) {

        String name="A H I L Y A N A G A R";
        String rev="";

        for (int i=name.length()-1;i>=0;i--)
        {
            char temp=name.charAt(i);
            if (temp== ' ')
            {
                continue;
            }
            rev=rev+temp;
        }
        System.out.println("reverse is "+rev);
    }
}
