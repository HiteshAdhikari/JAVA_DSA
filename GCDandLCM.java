// Finding GCD and LCM


import java.util.*;
public class GCDandLCM {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int temp1= n1;
        int temp2= n2;
       int gcd = 0 ;

        while(n2 % n1 != 0){
            int rem  = n2 % n1;
            n2 = n1;
            n1  = rem ;
            gcd = n1; 
        }
        int lcm  = (temp1 * temp2)/gcd;


        System.out.println(gcd);
        System.out.println(lcm);
        
        

         



















    }    
}
