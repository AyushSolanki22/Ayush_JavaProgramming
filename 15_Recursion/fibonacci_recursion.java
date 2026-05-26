//recursion involing two function calls at a  time ((in case of a raised to the power b, call is one only = pow(a,b/2)))
//result -- lot of calls as a whole

//Remember: it doesn't place 2 calls simultaneously(at once) (firstt left call will be executed, then second )
//Euler's tour tree 
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
///2**n time complexity (tree) (each term on each level calls 2 functions each) ,,,, 1+2+4+8+... (apply gp formula for T.C)
//0th, 1st, 2nd ,....nth element


//Overlapping issue, same cheez do-teen jagah ho rhi