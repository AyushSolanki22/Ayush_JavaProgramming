// public class Bp {
//     public static void main(String[] args) {
//         int n = 4;
//         for(int i = 1; i <= n; i++){
//             for(int j = 1; j <= 2 * n; j++){
//                 if(j <= i || j >= 2 * n + 1 - i)System.out.print("*");
//                 else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//         for(int i = n; i >= 1 ; i--){
//             for(int j = 2*n; j >= 1; j--){
//                 if(j <= i || j >= 2 * n + 1 - i)System.out.print("*");
//                 else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

import java.util.Scanner;

public class Bp{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt(); 
        n=n*2;
        for(int i=1; i<=(n/2); ++i){
            for(int j=1; j<=n; ++j){
                if(j<=i || j>=n+1-i){
                    System.out.print("*");
                }
                else{   
                    System.out.print(" ");
                }
            }
            System.out.println();      
         }
        for(int i=(n/2); i>=1; --i){
            for(int j=1; j<=n; ++j){
                if(j<=i || j>=n+1-i){
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