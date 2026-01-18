// binary number system to decimal number system - conversion
// dec=dec+[last digit*(2^pow)] **dec, num, ld, pow
import java.util.*;
public class Bin_to_dec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number n: ");
        int n=sc.nextInt(); 
        int pow=0 ;
        int dec=0; 
        while (n>0){
            int ld= n%10;
            dec=dec+(ld*(int)((Math.pow(2,pow))));  //Math.pow takes double and also return double datatype values
            pow++;
            n/=10;

        }
        System.out.println(dec);
    }
}
