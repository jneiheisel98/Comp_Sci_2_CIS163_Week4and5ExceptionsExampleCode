package week4and5exceptions;

public class SimpleTryExample {

    public static void main(String[] args) {
        int n = 0;   // user input
        int i;

        try {
            i = 5 / (n + 1);
            System.out.println("I am here A");
            i = 5 / n;
            System.out.println("I am here B");
            i = 5 / n - 1;
            System.out.println("I am here C");
        }

        catch (ArithmeticException e) {
            // xxxx

        }

        System.out.println("I am here at the end");
    }
}
