// public class _01_Triangle {
//     public static void main(String[] args) {
//         int n=5;   //changeable
//         for (int i=1; i<=n; ++i) {
//            for (int j=1; j<=i; ++j) {
//              if ((i+j)%2==0) {
//                 System.out.print(1);
//              }
//              else {
//                 System.out.print(0);
//              }
//            }
//         System.out.println();
//         }
        
//     }
// }
import java.util.*;

public class triangle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); 
        int num=1;
        for(int i=1; i<=n; ++i){
            num=i%2==0? 0:1;
            for(int j=1; j<=i; ++j){
                System.out.print(num);
                num=(num>=1?--num:++num);
                
            }

            System.out.println();
        }
    }
}
