///concept clearance to write number to a specified digit
//printing number by entering digit one by one from ones to ....
import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of digits: ");
        int dig=sc.nextInt();
        int num=0; 
        int pow=0;
        for(int i=0; i<=dig-1; ++i){
            System.out.print("enter digit: ");
            int n=sc.nextInt();
            num=num+(n*(int)Math.pow(10,pow));
            ++pow;
        }
        System.out.println(num);
    }
}
