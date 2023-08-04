import java.util.Scanner;

public class PalindromeStringChecking {
    public static boolean checkPalindrome (String palin){
       for (int i=0 ; i<palin.length()/2 ; i++){
           if (palin.charAt(i) != palin.charAt(palin.length()-1-i)){
              return false ;
           }
       }
            return true ;
    }
    public static void main(String[] args) {
        String palin = null ;

        Scanner inputPalin = new Scanner(System.in);
        System.out.println("Give me any word");
         palin = inputPalin.next() ;

         boolean flag =checkPalindrome(palin);
         
         if (flag) System.out.println("Given Text Is A Palindrome");
         else System.out.println("Given Text Is Not A Palindrome");

    }
}
