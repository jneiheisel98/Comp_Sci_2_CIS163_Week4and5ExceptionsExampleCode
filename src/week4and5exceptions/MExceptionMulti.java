package week4and5exceptions;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MExceptionMulti {

    public void method1() {
        try {
            ArrayList l = new ArrayList(10);
            l.get(3);
        } catch (IllegalArgumentException e) {
            System.out.println("here 1");
            throw new IndexOutOfBoundsException();
        } catch (Exception e) {
            System.out.println("here 2");
            //throw new IndexOutOfBoundsException();
            throw new myCheckException("Java");
        } finally {
            System.out.println("here I am");
            throw new IllegalArgumentException();
        }
       // System.out.println ("here 4");
    }

    public static void main(String[] args) throws IOException {
        MExceptionMulti example = new MExceptionMulti();

        try {
            example.method1();   	// example of unchecked exceptions
			example.method2();		// example checked exceptions
            System.out.println("here 0");

        } catch (IllegalArgumentException e) {
            System.out.println("here 1");
            throw new IllegalArgumentException();
//            try {
//                throw new IllegalArgumentException();
//            }
//            catch (IllegalArgumentException j){
//                System.out.println("index");
//            }
        }
//        catch (myCheckException e){
//            System.out.println("Here I am checked");
//        }
//        catch (Throwable e) {
//            System.out.println("here 2");
//        }
        System.out.println("Here at the end of it all!!!");
    }


    // example of checked exception.
    public void method2() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String inputit = "";

        inputit = in.readLine();

        int weight = Integer.parseInt(inputit);
    }
}
















