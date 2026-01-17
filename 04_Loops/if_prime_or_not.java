import java.util.*;
//Kisi eek number ka jo maximum possible multiple hai vo iss form mai hota hh--> n=Underroot n*Underroot n, where one decreases,other increases.
//till i=n-1 or i=underroot(n)
// Underrrot n times << (n-2) times -- optimised

//remember to specify a seperate if else to identify 2 as a prime number incase of i=2 to i=n-1 - as it will give incorrect answer;
public class if_prime_or_not {
    public static void main(String[] args) {
        boolean Isprime=true;
        Scanner sc = new Scanner(System.in);
        System.out.println("@Check- whether a number is prime or not\n");
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        for (int i=2; i<=Math.sqrt(n); ++i ) {   //-Simplified one ,FOr more simple smaller nos, i<=(n-1)
            if (n%i==0) {
                Isprime=false;
               }       
            }    
        if (Isprime==true) {
            System.out.println("The Entered number is a prime number.");

        }
        else {
            System.out.println("The Entered number is not a prime number.");
        }
    }
}