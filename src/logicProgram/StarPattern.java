package logicProgram;

public class StarPattern {
    static void main(String[] args) {
//             *
//            **
//           ***
//          ****
//         *****
//        ******
//         *****
//          ****
//           ***
//            **
//             *

        int row=11;
        int space=5;
        int star=1;

        for (int i=1;i<=row;i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= star; k++)
            {
                System.out.print("*");
            }
            System.out.println();

            if (i<6)
            {
                star++;
                space--;
            }
            else
            {
                star--;
                space++;
            }
        }

    }
}
