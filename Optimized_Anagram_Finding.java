import java.util.Arrays;

public class Optimized_Anagram_Finding {
    public static void main(String[] args) {
        String str1 = "race" ;
        String str2 = "caRe" ;

        str1 = str1.toLowerCase() ;
        str2 = str2.toLowerCase() ;

        if (str1.length() == str2.length()){
            char []strOne = str1.toCharArray() ;
            char []strTwo = str2.toCharArray() ;

            Arrays.sort(strOne);
            Arrays.sort(strTwo);

            if (Arrays.equals(strOne , strTwo))  System.out.println("Given Strings Are Anagram Of Each Other");
            else                                 System.out.println("Given Strings Are Not Anagram Of Each Other");
        }
        else System.out.println("Given Strings Are Not Anagram Of Each Other");
    }
}
