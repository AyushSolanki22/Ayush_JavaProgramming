public class miscellaneous_Pattern {
  public static void main(String[] args) {
      int n=436135; 

      String str=Integer.toString(n);
      int length=str.length(); 

      int no[]=new int[str.length()];

      int idx=str.length()-1;  
      int max=Integer.MIN_VALUE;

      while(n>0){
        int ld=n%10;
    
        no[idx]=ld;

        max=Math.max(max,ld);

        n/=10;
        idx--;
      }
      System.out.println(max);
      for(int i=0; i<max;++i){
        for(int j=0; j<=str.length()-1;++j){
          if(no[j]>0) {
            System.out.print("*");
            no[j]--;
          }
          else System.out.print(" ");
        }
        System.out.println();
      }
      

  }
}
