package arrayStudy;

public class ArraySample4 {
    static void main(String[] args) {
        // //Multidimensional array without using new keyword
        String subject[][]={{"ab","bc","cd"},{"de","ef","fg"}}; //2 rows //3 column

        //i --> row
        //j --> column

        for (int i=0;i<= subject.length-1;i++)
        {
            for (int j=0;j<=subject[i].length-1;j++)
            {
                System.out.print(subject[i][j]+"  ");
            }
            System.out.println();
        }
        //output--->   ab  bc  cd
        //             de  ef  fg

        System.out.println("========================================");

        String data [][]={{"ab","bc","cd"},{"de","ef","fg"},{"hi","ij","jk"}};
        for (int a=0;a<=data.length-1;a++)
        {
            for (int b=0;b<=data[a].length-1;b++)
            {
                System.out.print(data[a] [b]+"  ");
            }
            System.out.println();
        }
    }
}
