public class countingNumbersIn2DArray {
    public static int duplicateNumbers(int[][] multiArray , int key){
// Huzaifa Shahab test - 2
        int count = 0 ;
        for(int i=0;i<multiArray.length;i++){
            for(int j=0;j<multiArray[0].length;j++){

               if (multiArray[i][j]==key)  count++ ; // Count will increment its value if true.
            }
        }
        return count ;
    }
    public static void main(String[] args) {
        int [][] multiArray = {{4,7,8},
                               {8,8,7}} ;
        int key = 7 ;
        int count = duplicateNumbers(multiArray,key);  // Passing multiArray
        System.out.println(key+" is present "+count+" times");
    }
}
