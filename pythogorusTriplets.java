// In this we have to find that the number given can form a pythogotus triplets or right angled triangle.
            // P*P + B*B == H*H where H= Hypotenuse , P = Perpendicular and B = Base.
import java.util.*;
public class pythogorusTriplets {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int num3 = scn.nextInt();
        // Firstly we will find out the greatest number.
        int max = num1;
        if(num2 >= max){
            max = num2;

        }
        // Here, again checking that the num3 is either greater than max or not
        if(num3 >= max){
            max = num3;
        }

        // Now evaluating that whether the number can form Pythogorus Triplets or not by using the above said formula.

        if(max == num1){
            //Boolean return true or false.  
            boolean flag = ((num3 * num3  + num2 * num2)== (num1 * num1));
            System.out.println(flag);
        }
        else if(max == num2){
            boolean flag = ((num1 * num1  + num3 * num3)== (num2 * num2));
            System.out.println(flag);
        }
        else{
            boolean flag = ((num1 * num1  + num2 * num2)== (num3 * num3));
            System.out.println(flag);
        }

    }
}
