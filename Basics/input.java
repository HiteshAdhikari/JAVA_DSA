package Basics;
import java.util.*;
public class input {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
// Printing number
        // int a = scn.nextInt();
        // System.out.println("Printing the number : "+ a);

// Printing string
        // String name = scn.nextLine();
        // System.out.println("Printing the name : "+ name);


// Printing both number and string
        int b = Integer.parseInt(scn.nextLine());
        String name = scn.nextLine();
        System.out.println("Hey, " + name);
        for(int i = 0 ; i<=b; i++){
            System.out.println(i);
        }

        
    }

}
