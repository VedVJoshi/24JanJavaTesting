package logicProgram;

import java.util.Arrays;

//How to check the String is Anagram OR not?
//Anagram means --> ( silent / listen ) are different word,but they have same charter in their name
public class AnagramString {
    static void main(String[] args) {
        String name1="silent";
        String name2="listen";

        //step 1--> convert String in character for sort (arrange the character a to z)
          char[] data1=name1.toCharArray(); //when we used this they convert into like this
                                             // -->{'s' , 'i' , 'l' , 'e' , 'n' ,'t'}
          char[] data2=name2.toCharArray(); //when we used this they convert into like this
                                             // -->{'l' , 'i' , 's' , 't' , 'e' ,'n'}


        //step 2--> after covert we will sort (sort means arrange the word a to z) the words-->
         Arrays.sort(data1); //in here --> {'e' , 'i' , 'l' , 'n' , 's' ,'t'} //--> arrange a to z
         Arrays.sort(data2); //in here --> {'e' , 'i' , 'l' , 'n' , 's' ,'t'} //--> arrange a to z

        //step 3--> after sort we compare the two string in--> if -->
           //if they are equal if block true and will run
           //OR else block run
            if (Arrays.equals(data1,data2))
            {
                  System.out.println("Strings are Anagram");
            }
            else
            {
                  System.out.println("Strings are not Anagram");
            }


    }
}
