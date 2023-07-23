package Basics;

public class Basic {

    public static void main (String[] args) {
        //Variables are the address/container where we store the value that are allocated to them. 
        int a  = 1202;
        int b = 12;
        int sum = a+b;
        int sub = a-b;
        int prod = a*b;
        // Add
        System.out.println("Sum of " + a + " and " + b + " is: " + sum);

        // Sub
        System.out.println("Subtraction of " + a + " and " + b + " is: " + sub);

        // Multiplication
        System.out.println("Product of " + a + " and " + b + " is: " + prod);

        // Division = this return the quotient and according to the data type it will hold.
        System.out.println("Division of " + a + " and " + b + " is: " + (a/b));
        System.out.println("Division of " + b + " and " + a + " is: " + (b/a));

         // Modulus = this return the remainder.   
        System.out.println("Modulus of " + a + " and " + b + " is: " + (a%b));
        
        
    }
}