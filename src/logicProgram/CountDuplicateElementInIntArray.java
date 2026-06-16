package logicProgram;

public class CountDuplicateElementInIntArray {
    static void main(String[] args) {

        int ar[]={1,2,3,1,4,5,6,3,1,2,7,9,7,4};
        int count=0;

        for (int i=0;i<=ar.length-1;i++)
        {
            for (int j=i+1;j<= ar.length-1;j++)
            {
                if (ar[i]==ar[j])
                {
                    System.out.println("duplicate founded "+ar[j]);

                    count++;
                }
            }
        }
        System.out.println("Duplicate number are "+count);
    }
}
