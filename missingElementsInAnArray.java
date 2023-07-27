import java.util.Scanner;

public class missingElementsInAnArray {
    public static void main(String[] args) {

                final int size = 10 ;
                int largestEle = Integer.MIN_VALUE ; // -Infinity
                int smallestEle = Integer.MAX_VALUE ;// +Infinity

                int []array =  new int[size] ;

                Scanner inputEle = new Scanner(System.in) ;
                for(int i=0 ; i<array.length ; i++){ // User will input.
                    System.out.print("Input Element At Index ["+i+"] : ");
                    array[i] = inputEle.nextInt() ;
                    System.out.println();
                }

        for (int k : array) { // Figuring out Max And Min Value In Given Array.
            largestEle = Math.max(largestEle, k);
            smallestEle = Math.min(smallestEle, k);
        }
                System.out.println("These are the missing elements in given array");
                for (int i = smallestEle ; i <= largestEle ; i++){
                    int missingElement = i ;
                    boolean flag = false ;
                    for (int k : array) {
                        if (missingElement == k) {
                            flag = true;
                            break;
                        }
                    }
                    if (!flag){
                        System.out.print(missingElement+" ");
                    }
                }
            }
        }



