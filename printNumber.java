// Print the digit in a number.
import java.util.*;
public class printNumber {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num  = scn.nextInt();
        int digit = 0;
        int temp = num ;
        while(temp != 0 ){
            temp = temp /10 ;
            digit++;
        }

        int div = (int)Math.pow(10, digit-1);
        while(div != 0 ){
            int q = num / div;
            System.out.println(q);
            num = num % div;
            div = div / 10;

        }

    }
}
