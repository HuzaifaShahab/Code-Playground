public class lowerCaseVowelsCounting {
    public static void main(String[] args) {

        String str = "Pakistani" ;
        int counter = 0 ;
            for (int i=0 ; i<str.length() ;i++){
                if (str.charAt(i)=='a'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='e'||str.charAt(i)=='u'){
                    counter++ ;
                }
            }
            if (counter>=1)
                System.out.println("LowerCase Vowels occur ("+counter+") times in a given string");
            else
                System.out.println("No LowerCase Vowels in this case");

    }
}
