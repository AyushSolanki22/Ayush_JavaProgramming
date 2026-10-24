
import java.util.*;
public class powersOf2 {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    long n=sc.nextLong();
    long x=1;
    System.out.println(x<<n);   //it can calculate till 62 power,,,,, the left shift converts the number in binary  (conversion process) and return the ouput in long ---as result type is the type determined by left operand
  }
}
