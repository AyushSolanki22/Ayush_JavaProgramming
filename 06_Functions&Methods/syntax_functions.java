// Function = Method

// returnType name() {
// body
// return statement;
// }
import java.util.*;
public class syntax_functions {
    public static int printHelloWorld() {         //Another function;
        System.out.println("Hello World - from function printHelloWorld\n");
        System.out.print("Hello ");
        System.err.println("Ayush\n\n");
        return 3;             //it is a required statement in non-void functions, otherwise error.
        //As it is not a default func. like main (which runs automatically while executing your program), 
        //it is needed to be called explicitly called inside main function.
        
    }
    public static void calculateSum(int c,int d) {    //Function using parameters;
        int sum=c+d;
        System.out.println("Calculated sum: "+sum);
    }

    public static void main(String[] args) {
        // body
        System.out.println("Hello World");
        printHelloWorld();    //function call

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a =sc.nextInt();
        System.out.print("Enter number 2: ");
        int b =sc.nextInt();
        calculateSum(a,b);
    }
}