
public class subArrays_sum {
    public static void sum(int num[]) {
        int lss=Integer.MIN_VALUE;
        int sss=Integer.MAX_VALUE;
        for (int i=0; i<num.length; ++i) {     //Three nested loops -- n^3 time complexity 
            for(int j=i; j<num.length; ++j) { 
                int temp=0;                       //temp=currSum
                for (int k=i; k<=j; ++k) {   
                    //subArray sum  
                    temp+=num[k];              
                }
                System.out.print(temp+"    ");
                lss=(temp>lss? temp:lss);
                sss=(temp<sss? temp:sss);
        }
        System.out.println();
    }
    System.out.println("Maximum subArray sum: "+lss);
    System.out.println("Minimum subArray sum: "+sss);
    
    // or way 2-- Prefix sum  ----optimised soln.,,,, prefix array+ prefix[end]-prefix[start-1];
    // or way 3-- Kadane's Algorithm ---- more optimised soln.

}
    public static void main(String[] args) {
        int num[]={1,-2,6,-1,3};

        sum(num);
    }    
}
