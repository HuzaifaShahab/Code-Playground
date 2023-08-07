public class StringCompression_Query {
    public static void compressString(String str){
        StringBuilder newStr = new StringBuilder("") ; // Creating newStr object

        for (int i=0; i<str.length(); i++){ // Picking each element one-by-one
            Integer count = 1 ;      // Using Integer Class for string purpose
            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){  // i<n-1 b/c comparing i with next index.
                count++ ;
                i++;
            }
            newStr.append(str.charAt(i)) ;   // Appending letter.
            if (count > 1) newStr.append(count) ; // Appending count to String also.
        }
        System.out.println(newStr);      // Outcome
    }
    public static void main(String[] args) {
        String str = "aaabbccvvdd";
          compressString(str) ;          // passing str as an argument.
    }
}
