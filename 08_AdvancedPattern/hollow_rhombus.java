// public class hollow_rhombus {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i=1; i<=n; ++i) {
//             for (int j = 1; j <= n - i; ++j){
//                 System.out.print(" ");
//             }
//             for (int j = n-i+1; j <= 2*n - i; ++j ){
//                 if(i == 1 ||i == n ||j == 2*n-i||j==n-i+1) {
                
//                 System.out.print("*");
//                 }
//                 else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

import java.util.*;
public class hollow_rhombus{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of lines: ");
        int n=sc.nextInt();
        for(int i=1; i<=n; ++i){
            for(int j=1; j<=n*2-i; ++j){
                if((i==1 && j>=n+1-i) || i==n || j==n+1-i|| j==n*2-i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}

