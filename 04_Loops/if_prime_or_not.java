import java.util.*;
//Kisi eek number ka jo maximum possible multiple hai vo iss form mai hota hh--> n=Underroot n*Underroot n = 1 decreases,other increases.
// till i=n-1 or i=6^n
// Underrrot n times << (n-2) times

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
               }       }    
        if (Isprime==true) {
            System.out.println("The Entered number is a prime number.");

        }
        else {
            System.out.println("The Entered number is not a prime number.");
        }
    }
}