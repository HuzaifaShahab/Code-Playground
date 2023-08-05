public class SubStringConcept {
    public static void main(String[] args) {
        String str  = "HelloCoder" ;
        int sInd = 0 ;
        int eInd = 5 ;
        // Sub-String Concept similar to Sub-Array.
            for (int i=sInd ; i<=eInd ;i++){
                System.out.print(str.charAt(i)+" ");
             }

        System.out.println();
        System.out.print(str.substring(4,7));
    }
}
