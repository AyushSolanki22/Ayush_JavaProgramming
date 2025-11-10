import java.util.Scanner;
public class User_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String input = sc.next();          //It takes only 1 word of input of String. (String input)
        System.out.println("You entered: " + input);
        
        sc.nextLine(); // Clear the buffer
        
        System.out.print("Enter a line of text: ");
        String line = sc.nextLine();          //nextLine() -- take a full line till \n as input.
        System.out.println("You entered: " + line);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("You entered: " + number);
        
        System.out.print("Enter a decimal number: ");
        float fl = sc.nextFloat();
        System.out.println("You entered: " + fl);
        
        sc.close(); // Good practice to close the Scanner
    }
}