package homework;

import java.util.Scanner;

public class Programme_9ConvertUpperToLowerCase {
    /**
     * Write a program to convert the upper case to lower case.
     */

    public static void main(String[] args) {
        // scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase string : ");
        String uppercase = scanner.nextLine();
        Programme_9ConvertUpperToLowerCase t = new Programme_9ConvertUpperToLowerCase();
        t.convertUpperToLoweCase(uppercase);
        // scanner closing
        scanner.close();
    }
    // conversion of uppercase to lower case method
    public void convertUpperToLoweCase(String text){
        System.out.println("The Lowercase value is = " + text.toLowerCase());

    }
}
