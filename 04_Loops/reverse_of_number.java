//Concept 
// To get reverse of a number, we use modulus %.
// Generally, whenver any no is divided by 10, remainder gives us the last digit of no. #last digit=num%10;
// And when to remove last digit, divide it by 10.  //remove last digit=num/10;
// These two steps repeated again and again , for getting reverse of a number.
// 1089
// 108
// 10
// 1 --> Last digit itself
// 0 --> number non dividable, loop ends (not included in reverse)

public class reverse_of_number {
    public static void main(String[] args) {
        int n=234567;
        while (n>0) {
            int last_digit= n%10;
            System.out.print(last_digit);
            n/=10;
        }
        System.out.println();


        //Assigning reverse of a number to variable itself;
        int rev=0;
        int num=10899;
        while (num>0) {
            int LastDigit=num%10;
            rev=(rev*10)+LastDigit;    //main step to get reverse into a variable itself
            num/=10;
        }
        System.out.println(rev);
    }
}