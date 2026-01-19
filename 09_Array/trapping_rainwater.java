//auxiliary arrays(helper arrays) -- 2 pointer approach
public class trapping_rainwater {
    public static void trappedRainwater(int b[])  {   //time complexity= 0(n)
        int n=b.length;

        //creating left max boundary -- array
        int leftMax[]=new int[n];
        leftMax[0]=b[0];
        for (int i=1; i<n; ++i) {
            leftMax[i]=Math.max(b[i], leftMax[i-1]);
        }

        //creating right max boundary -- array
        int rightMax[]=new int[n];
        rightMax[n-1]=b[n-1];
        for (int i=n-2; i>=0; --i) {
            rightMax[i]=Math.max(b[i], rightMax[i+1]);
        }

        int tr=0;
        int w=0;
        //loop
        for (int i=0; i<n; ++i) {
            w=Math.min(leftMax[i],rightMax[i]);   //waterlevel = w=  min(right max,left max);
            tr+=(w-b[i])<0? 0:(w-b[i])*1;         ////trapped rainwater= (water level-building height)*width 

        }
        System.out.println("Trapped rainwater: "+tr);
        // for (int i=0; i<b.length; ++i) {
        //     System.out.print(leftMax[i]+" ");
        // }
        // System.out.println();
        // for (int i=0; i<b.length; ++i) {
        //     System.out.print(rightMax[i]+" ");
        // }

}       
    public static void main(String[] args) {
        int b[]={4,2,0,6,3,2,5};     //buildings

        trappedRainwater(b);

    }    
}
