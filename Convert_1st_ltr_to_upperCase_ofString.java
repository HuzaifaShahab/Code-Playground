public class Convert_1st_ltr_to_upperCase_ofString {
    public static void letterUppercase (String str){
        StringBuilder newStr = new StringBuilder("") ;
        Character ch ;

        ch=0 ;
        newStr.append(Character.toUpperCase(ch)) ;
        for (ch=1 ; ch<str.length(); ch++){
            if (ch == ' ' && ch < str.length()){
                newStr.append(Character.toUpperCase(ch+1)) ;
            }else  newStr.append(ch) ;

        }
        System.out.println(newStr);
    }
    public static void main(String[] args) {
        String str = "hi, iam huzaifa shahab" ;
            letterUppercase(str);
    }
}
