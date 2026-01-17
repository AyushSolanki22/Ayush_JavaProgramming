import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Operator: ");
        char operator = sc.next().charAt(0);        //sc.next() for string input, sc.next().charAt(0) for single character input basically.


        switch(operator) {
            case '+' :
                System.out.println("Result: " + (a + b));
                break;
            case '-' :
                System.out.println("Result: " + (a - b));
                break;
            case '*' :
                System.out.println("Result: " + (a * b));
                break;
            case '/' :
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            case '%' :
                if (b != 0) {
                    System.out.println("Result: " + (a % b));
                } else {
                    System.out.println("Error: Modulo by zero!");
                }
                break;
            default :
                System.out.println("Error: Invalid operator!");
        }

        sc.close(); // good practice to close the scanner

    }
}
