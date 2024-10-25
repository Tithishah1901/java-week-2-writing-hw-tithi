package homework;

import java.util.Scanner;

public class Programme_15SwapTheValue {
    /**
     * Write a Java program to swap two variables.
     */

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first variable value : ");
        int first = scanner.nextInt();
        System.out.println(" Enter the second variable value : ");
        int second = scanner.nextInt();
        Programme_15SwapTheValue t = new Programme_15SwapTheValue();
        t.swapTheValue(first,second);
        //closing the scanner object
        scanner.close();
    }
    // swapping the value of variables
    public void swapTheValue(int a, int b){
        int c;
        System.out.println("Before the swapping, The values of first variable is : " + a + " and second variable is : " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("After the swapping, The values of first variable is : " + a + " and second variable is : " + b);

    }
}
