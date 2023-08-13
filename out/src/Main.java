import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArraySort arraySort = new ArraySort() ;
        Scanner sc = new Scanner(System.in) ;

        final int size = 5 ;
        int []array = new int[size] ;

        for (int i=0 ;i< array.length;i++){
            System.out.print("Input Element No "+i+1+" : "+sc.nextInt());
            System.out.println();
        }
    }
}
