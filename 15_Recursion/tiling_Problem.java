//count the number of tiles placable in floor.
public class tiling_Problem {
    public static int tilingProblem(int n) {  //2*n (floor size)
        if (n==0||n==1){    //base case
            return 1;
        }
        //kaam (choices)
        //vertical choice 
        int fnm1=tilingProblem(n-1); //choices next (func call)

        //horizontal choice
        int fnm2=tilingProblem(n-2);
        int totWays=fnm1+fnm2;
        return totWays;

    }
    public static void main(String[] args) {
        int n=3;  

        System.out.println(tilingProblem(n));
    }
}
