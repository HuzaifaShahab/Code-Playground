import java.util.Scanner;

public class Element_search_multiArray {
    public static void main(String[] args) {

                final int row = 2 ;
                final int col = 5 ;

                int [][] multiArray = new int[row][col] ;

                Scanner inpNumber = new Scanner(System.in) ;     // User will input values for each index.
                for (int i=0 ; i< multiArray.length ; i++){
                    for (int j=0 ; j<multiArray[i].length ; j++){
                        System.out.print("Input element at index ["+i+"]["+j+"] : ");
                        multiArray[i][j] = inpNumber.nextInt() ;
                        System.out.println();
                    }
                }
                // Elements of row-1 that are not in row-2
                System.out.println("Elements of row-1 that are not in row-2");
                for (int i = 0 ; i<multiArray[0].length ; i++){
                    int element = multiArray[0][i] ;              // 1st Element & so on
                    boolean mapElement = true ;

                    for (int j=0 ; j<multiArray[1].length ; j++){
                        if (element == multiArray[1][j]){
                            mapElement = false ;
                            break ;
                        }
                    }
                    if (mapElement){   // Element not found in row-2
                        System.out.print(element+" ");
                    }
                }
                System.out.println();
                System.out.println("Elements of row-2 that are not in row-1");
                for (int i=0 ; i<multiArray[1].length ; i++){
                    int element = multiArray[1][i] ; // 2nd-row 1st element.
                    boolean mapEle = true ;
                    for (int j =0 ; j<multiArray[0].length ; j++){
                        if (element == multiArray[0][j]){
                            mapEle = false ;
                            break;
                        }
                    }
                    if (mapEle){ // Element not found in row-1
                        System.out.print(element+" ");
                    }
                }
            }
        }
