//Q1: Print numbers from n to 1(Decreasing order):  --using recursion
//Q2: Print numbers from 1 to n(Increasing order): 
//Recursion
public class problem_1_2 {
    public static void printDec(int n) {
        if (n==1) {                    //base case
            System.out.println(n);  
            return;
        }
        System.out.print(n+" ");       //work
        printDec(n-1);                 //function call
    }
    public static void printInc(int n) {
        if (n==1){                      //base case
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);            //functionc call
        System.out.print(n+" ");  //recursion back loop - work done in back loop, not in top to down loop
    }
    public static void main(String[] args) {
        int n=10;

        printDec(n);
        printInc(n);
    }
}

//understand memory concept of recursion : Stack 
