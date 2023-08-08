public class checkingStrings_Anagram {
    public static void main(String[] args) {
        // Brute Force --- Not Much Optimized Logic
        String str1 = "care" ;
        String str2 = "Race" ;
        boolean anagram = false ;

        str1 = str1.toLowerCase() ;
        str2 = str2.toLowerCase() ;

        for (int i=0; i<str1.length(); i++) {
            int j=0 ;
            while (j < str2.length() && str1.length() == str2.length()){
                if (str1.charAt(i) == str2.charAt(j)){
                    anagram = true ;
                    break ;
                }
                else anagram = false ;
                j++ ;
            }
            if (!anagram) break ;
        }
        if (anagram) System.out.println("Given Strings Are Anagram Of Each Other");
        else System.out.println("Given Strings Are Not Anagram of each other");
    }
}
