package homework;

import java.util.Scanner;

public class Programme_13AverageOfNumbers {
    /*
     *Write a Java program that takes three numbers as input to calculate and
     *print the average of the numbers.
     */

    public static void main(String[] args) {
        // scanner declaration for reading input console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        double x = scanner.nextDouble();
        System.out.println("Enter The second number : ");
        double y = scanner.nextDouble();
        System.out.println("Enter the third number :  ");
        double z = scanner.nextDouble();
        averageOfThreeNumbers(x,y,z);
        // closing the scanner object
        scanner.close();

    }
    // calculation the average of three numbers
    public static void averageOfThreeNumbers(double a, double b, double c){
        double average = (a + b + c) / 3;
        System.out.println("The average of " + a +" , " + b + " and " + c + " is : " + average);
    }
}
