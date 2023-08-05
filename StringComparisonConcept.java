public class StringComparisonConcept {
    public static void main(String[] args) {
        String st1 = "Tony" ;
        String st2 = "Tony" ;
        String st3 = new String ("Tony") ;

//        if (st1==st3) System.out.println("Strings Are Equal");     // Not Equal b/c they are comparing at object level
//        else System.out.println("Not Equal");

//        if (st1==st2) System.out.println("Strings Are Equal");     // Equal b/c they are comparing at value level
//        else System.out.println("Not Equal");

        // Important Note :
        // They are not just counting letters instead they are matching each index with even counting a space.
    }
}
