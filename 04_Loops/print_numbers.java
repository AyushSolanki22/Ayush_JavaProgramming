import java.util.*;

public class print_numbers {
    public static void main(String[] args) {
        System.out.println("\"@Printing numbers from 1 to 100\"\n");
        int num=1;
        while (num<=100) {
            System.out.print(num+" ");
            ++num;
        }

        System.out.println("\n\n\n\"@Numbers Print from 1 to n.\"\n");
        int i=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number n: ");
        int n = sc.nextInt();
        while (i<=n) {
            System.out.print(i+" ");
            ++i;
        }


        
    }
}