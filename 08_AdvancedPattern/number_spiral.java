// Number Spiral

import java.util.*;
public class number_spiral {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            for(int i=1; i<=2*n-1;++i){
                for(int j=1; j<=2*n-1; ++j){
                    int a=i,b=j;
                    if(a>n) a=2*n-a;
                    if (b>n) b=2*n-b;

                    System.out.print(Math.min(a, b));
                }
                System.out.println();
            }
        }   
    }

