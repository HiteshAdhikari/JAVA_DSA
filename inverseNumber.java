import java.util.*;
public class inverseNumber {
public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int cnt  = 0 ;
        int ans = 0 ;
        while(num != 0 ){
            int temp = num % 10;
            num = num / 10;
            cnt++;
            ans  += cnt * (int)Math.pow(10,temp-1 );

        }
        System.out.println(ans);

}    
}
