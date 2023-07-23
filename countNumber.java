
//Count the digits in a number
import java.util.*;
public class countNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int dig = 0 ;
        while(num !=0 ){
            num = num / 10;
            dig++;
        }
        System.out.println(dig);
    }
    
}
