public class power {
    //(simple approach) - unoptimised 
    public static int pow(int x,int n) {
        if (n==0){
            return 1;
        }
        int power=x*pow(x,n-1);
        return power;
    }
    //it's time consuming program so have to optimise

    //optimized;
    //time complexity = 0(logn)
    public static int optimizedPow(int x,int n) {
        if (n==0){
            return 1;
        }
        int HalfPower=optimizedPow(x, n/2); //this, to have 0(logn) time complexity;
        int HalfPowerSq=HalfPower*HalfPower;    //will be executed in recursion back loop
        
        //if n is odd,             (additional)
        if (n%2!=0){
            HalfPowerSq=x*HalfPowerSq;
        }
        return HalfPowerSq;
    }
    public static void main(String[] args) {
        int x=2;
        int n=10;
        System.out.println(pow(x, n));
        System.out.println(optimizedPow(x, n));

    }
}

//In this question,
//function can be called in this manner a**b=a**(b/2)*a**(b/2) -if b is even and a**b=a**(b/2)*a**(b/2)*a - if b is odd , instead of a**b=a*(a**b-1)
//This will result into logb complexity --- optimised
//Also in the program, there is only one call =pow(a,b/2) , if b is even--> call*call,, if odd --> call*call
