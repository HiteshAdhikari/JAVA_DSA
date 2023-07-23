// Printing the fibonacci number
import java.util.*;
public class print_FibonacciNo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a  = scn.nextInt();

        int f = 0 ;
        int s = 1;
        int sum = 0;

        // Start from f = 0 and s = 1 and than add them and shift f to s and s to the sum.
        for(int i = 1 ; i<= a ; i++){
            System.out.println(f);
             sum = f+s;
            f = s;
            s = sum;
        }
    }
    
}
