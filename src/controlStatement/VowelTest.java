package controlStatement;

public class VowelTest {
    static void main(String[] args) {

        //A, E, I, O, U --> Vowel in English
        // Out of this are --> consonant in English     //OR --> 1 Condition is true output is true
                                                              // 2 conditon is true output is true
        char vowel = 'A';
        if (vowel == 'A' || vowel == 'E' || vowel == 'I' || vowel == 'O' || vowel == 'U')
        {
            System.out.println("Given character is vowel");
        }
        else
        {
            System.out.println("Given character is consonant");
        }

    }
}
