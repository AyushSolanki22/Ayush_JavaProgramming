//prefix sum method -- prefix array + formula - prefix[end]-prefix[start-1];
//only 2 loops used : thus optimistic approach;\
public class optimisticApproach_maxsum {
    public static void prefixSum(int num[]) {
        int prefix[]=new int[num.length];
        int temp=0;                        //temp=currSum
        int maxsum=Integer.MIN_VALUE;
        prefix[0]=num[0];
        //creating preifx array
        for (int i=1; i<prefix.length; ++i) {
            prefix[i]=prefix[i-1]+num[i];

        }
        for (int i=0; i<num.length; ++i) {
            for (int j=i ; j<num.length; ++j) {
                temp=(i==0)? prefix[j] : prefix[j]-prefix[i-1]; //temp = using formula gets associate with subArray sum  //for i==0 - special condition
                maxsum=temp>maxsum? temp:maxsum;
                // System.out.print(temp+" ");
            }
        } 
        System.out.println("Maximum subArray sum: "+maxsum);
        //time comolexity now becomes n^2 (thus optimised approach);

    }
    public static void kadanesAlgorithm(int num[]) {    //single loop only -- very optimised-- n time complexity
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for (int i=0; i<num.length; ++i) {
            cs+=num[i];
            cs=cs>0? cs:0;
            ms=cs>ms? cs:ms;
        }        

        if(ms==0){                    //Special condition
            ms=Integer.MIN_VALUE;
            for(int i=0; i<num.length; ++i){
                if (num[i]>ms){
                    ms=num[i];
                }
            }
        }
        
        System.out.println("Max subArray sum: "+ms);
    }
    public static void main(String[] args) {
        int num[]={-2,-3,4,-1,-2,1,5,-3};
 
        prefixSum(num);
        kadanesAlgorithm(num);
    }
}
