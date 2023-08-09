import java.util.Arrays;

public class Optimized_Anagram_Finding {
    public static void main(String[] args) {
        String str1 = "race" ;
        String str2 = "caRe" ;
// Converting String to lower case.
        str1 = str1.toLowerCase() ;
        str2 = str2.toLowerCase() ;

        if (str1.length() == str2.length()){    // String length must be equal for Anagram.
            char []strOne = str1.toCharArray() ;   // Pushing string into character array.
            char []strTwo = str2.toCharArray() ;

            Arrays.sort(strOne); // Sorting the Array to match string.
            Arrays.sort(strTwo);
            // Now checking sorted array content.
            if (Arrays.equals(strOne , strTwo))  System.out.println("Given Strings Are Anagram Of Each Other");
            else                                 System.out.println("Given Strings Are Not Anagram Of Each Other");
        }
        else System.out.println("Given Strings Are Not Anagram Of Each Other");
    }
}
