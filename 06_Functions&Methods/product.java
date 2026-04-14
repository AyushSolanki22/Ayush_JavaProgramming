
import java.util.Scanner;

public class product {
    static double numProduct(double  a, double b) {
        double prod=a*b;
        return prod;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number 1: ");
        double num1=sc.nextDouble();
        System.out.print("Enter number 2: ");
        double num2=sc.nextDouble();
        double product = numProduct(num1,num2);
        System.out.println("Calculated product: "+product);

    }
}