import java.util.Arrays;
public class fibonacci_recursion {
    public static int fibonacciRec(int n) {
        if (n==0 || n==1) {
            return  n;
        }        
        if(dp[n]!=0){
            return dp[n];   //returning stored fibo(n) 
        }
        int fibo=fibonacciRec(n-1)+fibonacciRec(n-2);
        dp[n]=fibo;    //storing fibo(n)
        return fibo;
    }

    static int dp[];
    public static void main(String[] args) {
        int n=6;
        dp=new int[n+1];
        Arrays.fill(dp, 0);   //filling all elements to zero for checking if fibo result is available or not in recursion

        System.out.println(fibonacciRec(n));
    }
}


//time complexity = 2n-1 = 0(n)

//auxilary space = 0(n)+0(n)