import java.util.*;
// In this we have to write teh number in reverse (means from left to right).
public class reversePrintNo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        while(num != 0){
            int q = num%10;
            System.out.println(q);
            num  = num /10;
    }
    }
    
}
