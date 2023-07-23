// Here we have to print the prime number between the start and end number.


import java.util.*;
public class printPrimeNo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // take the input between which you have to tell the prime number.
        int start  = scn.nextInt();
        int end = scn.nextInt();

        // start a loop from start to end.
        for(int i = start; i <= end; i++){
            //Initialize count  = 0 and if a number is divisible between 2 till the number's root than increment the count.
            int count = 0;
            for(int j = 2; j*j <= i ; j++){
                if(i % j == 0){
                    count++;
                    break;
                }
            }
            // if not incremented than it means the number is prime and print it.
            if(count == 0 ){
                System.out.println(i);
            }
        }

    }
}
