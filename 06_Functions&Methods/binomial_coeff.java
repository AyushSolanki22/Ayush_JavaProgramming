import java.util.*;
public class binomial_coeff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        System.out.print("Enter r: ");
        int r=sc.nextInt();
        int b=bino_coeff(n,r);
        System.out.println("Binomial Coefficient: "+b);

        
    }
    public static int bino_coeff (int n, int r) {
        int nf=factorial(n);      //n factorial
        int rf=factorial(r);      //r factorial
        int nmrf=factorial(n-r);   //(n-r)factorial
        int b=((nf))/((rf)*(nmrf));  //formula

        return b;
    
    }
    public static int factorial(int n) {
        int f=n;
        for (int i=(n-1); i>=1; --i) {
            f*=i;

        }
        return f;
    }


}