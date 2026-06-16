package logicProgram;

public class FindDuplicateElementInString {
    static void main(String[] args) {

        String [] name={"api","java","sele","api","data","java","digi","sele"};
        int count=0;

        for (int i=0;i<=name.length-1;i++)
        {
            for (int j=i+1;j<=name.length-1;j++)
            {
               if (name[i].equals(name[j]))
               {
                   System.out.println("Duplicate String find "+name[j]);
                   count++;

               }
            }
        }
        System.out.println("duplicate string count is "+count);

    }
}
