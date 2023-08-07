public class StringCompression_Query {
    public static void compressString(String str){
        StringBuilder newStr = new StringBuilder("") ;

        for (int i=0; i<str.length(); i++){
            Integer count = 1 ;
            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++ ;
                i++;
            }
            newStr.append(str.charAt(i)) ;
            if (count > 1) newStr.append(count) ;
        }
        System.out.println(newStr);
    }
    public static void main(String[] args) {
        String str = "aaabbccvvdd";
          compressString(str) ;
    }
}
