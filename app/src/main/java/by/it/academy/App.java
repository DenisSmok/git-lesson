/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package by.it.academy;

public class App {
    static int a=5;
    static int b=8;
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        printValue();
    }

    private static void printValue() {
        System.out.println(a+b);

        System.out.println(a*b);
    }

}
