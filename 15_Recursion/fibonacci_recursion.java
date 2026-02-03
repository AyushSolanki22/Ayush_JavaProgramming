public class fibonacci_recursion {
    public static int fibonacciRec(int n) {
        if (n==0 || n==1) {
            return  n;
        }        
        int fibo=fibonacciRec(n-1)+fibonacciRec(n-2);
        return fibo;
    }
    public static void main(String[] args) {
        int n=6;

        System.out.println(fibonacciRec(n));
    }
}
///2*n time complexity (each term on each level calls 2 functions each)
//0th, 1st, 2nd ,....nth element