import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {

        reverseWordInMyString("emocleW ot kooBsrennigeB");
       // reverseWordInMyString("This is an easy Java Program");
    }
    public static  void reverseWordInMyString(String str)
    {
        /* The split() method of String class splits
         * a string in several strings based on the
         * delimiter passed as an argument to it
         */
         String[] words = str.split("\\s");

         //System.out.print(Arrays.toString(words));
        String  reverseString  = "";
        for(int i=0; i<words.length; i++){
            String word = words[i];
            String reverseWords = "";
            for(int j=word.length() -1; j>=0; j--){
                /* The charAt() function returns the character
                 * at the given position in a string
                 */
                reverseWords += word.charAt(j);
            }
            reverseString += reverseWords + " ";
        }

        System.out.println(str);
        System.out.println(reverseString);

    }
}
