// In this we have to rotate the digits if the  number is +ve than rotate from backward to forward and if the digit is -ve than rotate from forward to backward.
// Ex --> number is 1235 and the rotation is 2 means rotate from backward i.e 3512.
// now the rotation is  -1 means rotate from forward i.e 2351.



import java.util.*;
public class rotateNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int k = scn.nextInt();
// firstly i will count the digits.
        int temp = num;
        int digit = 0 ;
        while(temp > 0){
            temp = temp / 10;
            digit++; 
        }


// This is when the rotation number is very big but the number after a certain rotation will repeat..so this will handle them.
// Ex --> The number is 3421 and you got rotaion 241 than see after 4 rotation the number will be same as 1 rotation like for 5(1342) it will be same as 1(1342) sp to reduce this calculation we will do teh modulus of the rotation with the no. fo digits ....for the above example you will get 241 % 4 = 1...means 1 rotation will be same as 241 rotation.  
        k = k % digit ;

// This is for negative rotation..if you have -1 (3421 this is teh number) rotation for the above said example than it will be same as rotating 3 digits from backwards ....so to do this we will use the following code.
        if(k<0){
            k= k+digit;
        }


// Now , here i will make a divisor so that the rotation number can be struck from the dividend
// and make a multiplier so that the number strucked out can be attached in front or back. 
        int div = 1;
        int mul = 1;
        for(int i  = 1 ; i <= digit;i++ ){
            if(i<=k){
                div = div * 10; 
            }else{
                mul = mul * 10;
            }
        }

// Here , i am dividing and strucking out the rotating number.
        int q = num / div;
// In this i am saving the strucked number 
        int rem = num % div;
// Now, i am combining all of them to make the rotated number.
        int rotate = rem * mul + q;
        System.out.println(rotate);

    }
}
