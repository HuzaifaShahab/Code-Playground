public class printingRowSum {
    public static void rowSum (int [][]multiArray){
        int row = 1 ;
        int rSum = 0 ;
        // Printing Second Row Sum.
        for (int i=row , j=0 ;j< multiArray[row].length;j++){
            rSum += multiArray[i][j] ;
        }
        System.out.println("Second Row Sum Is : "+rSum);
    }
    public static void main(String[] args) {
        int [][] multiArray = {{1,4,9},
                               {11,4,3},
                               {2,2,3}} ;
        rowSum(multiArray);

    }
}
