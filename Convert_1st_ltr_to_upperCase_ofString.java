public class Convert_1st_ltr_to_upperCase_ofString {
    public static void letterUppercase (String str){
        StringBuilder newStr = new StringBuilder("") ;
        int i = 0 ;
        char ch = Character.toUpperCase(str.charAt(i)) ; // To use (upperCase) for (char) you have to use Character Class.
        newStr.append(ch) ;
        for (i=1 ; i<str.length();i++){

            if (str.charAt(i) == ' ' && i<str.length()-1){ // Imp Logic
                newStr.append(str.charAt(i)) ;
                i++ ;
                newStr.append(Character.toUpperCase(str.charAt(i))) ; // Same we will upper case the letter after space.
            }else
                newStr.append(str.charAt(i)) ;

        }
        System.out.println(newStr);      // Printing
    }
    public static void main(String[] args) {
        String str = "hi, i am huzaifa shahab !" ;
            letterUppercase(str);
    }
}
