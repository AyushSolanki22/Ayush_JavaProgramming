// decimal number system to binary number system - conversion
// bin=bin+[bin*(10^pow)] **bin, num, rem pow
import java.util.*;
public class dec_to_bin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number n: ");
        int n=sc.nextInt();
        int rem=0;
        int bin=0;
        int pow=0;
        while(n>0){
            rem=n%2;
            bin=bin+(rem*(int)Math.pow(10,pow));
            n/=2;
            ++pow;
        }
        System.out.println(bin);
    }
}
