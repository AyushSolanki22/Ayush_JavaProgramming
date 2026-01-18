import java.util.*;

public class factorial {
    public static void main(String[] args) {
        // using while loop
        int fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=sc.nextInt();
        int a=num;
        while (a>1) {
            
            fact*=a;
            --a;
        }
        System.out.println("Factorial of "+num+" is: "+fact);
        

    
    }
}