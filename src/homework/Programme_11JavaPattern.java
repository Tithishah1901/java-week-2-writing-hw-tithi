package homework;

public class Programme_11JavaPattern {
    /* Write a Java program to display the following pattern.
Sample Pattern :
J a v v a
J a a v v a a
J J aaaaa V V aaaaa
J J a a V a a
 */

    public static void main(String[] args) {
        Programme_11JavaPattern t = new Programme_11JavaPattern();
        System.out.println("---------------------------------------------");
        t.javaPattern();

    }

    // Printing the java pattern
    public void javaPattern() {
        System.out.println("J  a  v   v a");
        System.out.println("J a a  v v a a");
        System.out.println("J J aaaaa  V V aaaaa");
        System.out.println("J J a   a  V a  a");

    }
}
