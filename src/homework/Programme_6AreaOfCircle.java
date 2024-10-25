package homework;

import java.util.Scanner;

public class Programme_6AreaOfCircle {
    /**
     * Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r).
     */

    public static void main(String[] args) {
        // Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius : " );
        double radius = scanner.nextDouble();
        areaOfCricle(radius);
        // closing the scanner
        scanner.close();
    }

    // calculating the area of circle
    public static void areaOfCricle(double radius) {
        double pi = Math.PI;
        double area = (pi * radius * radius);
        System.out.println("The area of circle is : " + area);
    }
}
