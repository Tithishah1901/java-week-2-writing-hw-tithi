package homework;

import java.util.Scanner;

public class Programme_7TempConversion {
/**
 * Write a program to insert any temperature value in degree Fahrenheit
 * and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

public static void main(String[] args) {
    // scanner declaration for reading input from console
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the temperature in fahrenheit : ");
    float temp = scanner.nextFloat();
    // object creation
    Programme_7TempConversion t = new Programme_7TempConversion();
    t.covertTempToDegreeCelsius(temp);

}

   // temperature conversation method
    public void covertTempToDegreeCelsius(float temp){
    float c = ((temp - 32 ) * 5/9);
        System.out.println("The temperature " + temp + " fahrenheit is equal to " + c + " degree celsius");
    }

}
