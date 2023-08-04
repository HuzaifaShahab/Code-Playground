import java.util.Scanner;

public class PalindromeStringChecking {
    public static void checkPalindrome (String palin){
        int i = 0 ;
        while (palin.charAt(i) == palin.length()-i-1 ){
            i++ ;
        }
    }
    public static void main(String[] args) {
        String palin = null ;

        Scanner inputPalin = new Scanner(System.in);
        System.out.println("Give me any word");
         palin = inputPalin.next() ;

         checkPalindrome(palin);

    }
}
