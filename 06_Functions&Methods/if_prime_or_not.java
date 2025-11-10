// Checking whether it's a prime no. or not using a function & without any 3rd variable.

//only for n>=2;
public class if_prime_or_not {
    public static void main(String[] args) {
        System.out.println(isPrime(9));
    }
    public static boolean isPrime(int n) {
        for (int i=2; i<=(n-1); ++i) {    // or to optimise , i<=math.sqrt(n)
            if (n%i==0) {
                return false;
            }

        }
        return true;
        
    }
}