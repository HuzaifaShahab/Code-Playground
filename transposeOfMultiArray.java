public class transposeOfMultiArray {
    public static void arrayTranspose (int [][] multiArray){

        int [][]multiArr = new int[3][2] ;

        System.out.println("Array Before Transpose");
        for (int i=0;i<multiArray.length;i++){
            for (int j=0;j<multiArray[0].length;j++){
                System.out.print(multiArray[i][j]+" ");
                multiArr[j][i] = multiArray[i][j] ;
            }
            System.out.println();
        }
        System.out.println("Array After Transpose");
        for (int i=0 ; i<3;i++){
            for (int j=0;j<2;j++){
                System.out.print(multiArr[i][j]+" ") ;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        int [][]multiArray = {{1,2,3},{4,5,6}} ;
           arrayTranspose(multiArray);
    }
}
