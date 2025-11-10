// import java.util.*;

// public class hollow_rectangular {
//     public static void pattern(int totRows,int totCols) {
//         for (int i=1; i<=totRows; ++i) {
//             for (int j=1; j<=totCols;++j ) {
//                 if (i==1||i==totRows||j==1||j==totCols) {
//                     System.out.print("*");
//                 }
//                 else {
//                     System.out.print(" ");

//                 }
            
//             }
//             System.out.println();

//          }
        
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter number of rows to be printed: ");
//         int r=sc.nextInt();
//         System.out.print("Enter number of columns to be printed: ");
//         int c=sc.nextInt();        

//         pattern(r,c);
//     }
// }


import java.util.*;
public class hollow_rectangular {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no. of rows to be printed: ");
        int m=sc.nextInt();
        System.out.print("enter no. of cols to be printed: ");
        int n=sc.nextInt();
        pattern(m,n);

    }   
    public static void pattern(int m, int n){
        for(int i=1; i<=m; ++i){
            for(int j=1; j<=n; ++j){
                if(i==1 || i==m){
                    System.out.print('*');
                }
                else{
                    System.out.print((j==1 || j==n? '*':' '));
                }
            }
            System.out.println();
        }
    } 
}

