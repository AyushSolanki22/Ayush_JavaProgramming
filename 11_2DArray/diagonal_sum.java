//only for diagnonal arrays --> n=m;
//Diagonal sum== primary diagonal sum+secondary diagonal sum
//we should consider odd oder diagonal array as sum primary and secondary diagonal both would be including middle element.
public class diagonal_sum {
    public static void diagonalSum(int m[][]) {    //time complexity=0(n)
        int diag_sum=0;
        int sr=0,sc=m[0].length-1;
        for (int i=0; i<m.length; ++i) {
            for (int j=0; j<m[0].length; ++j) {
                if (i==j) {           //Primary diagonal
                    diag_sum+=m[i][j];
                }                    
                // if (i==sr && j==sc) { //Secondary diagonal  //if used only if approach also include middle element in case of odd order matrix (overlapping element), so use else if
                //     diag_sum+=m[i][j];
                // }
                else if(i+j==(m.length-1)){  //avoids overlapping element addition by using else if
                    diag_sum+=m[i][j];
                }
            }
            sr++;
            sc--;

        }
        System.out.println("Diagonal sum: "+diag_sum);
    }
    public static void diag_sum_2(int m[][]) {
        //optimised approach,, time complexity-0(n)
        int sum=0;
        for (int i=0; i<m.length; ++i) {
            //pd- primary diag
            sum+=m[i][i];
            //sd
            if (i!=m.length-1-i) {    //except when i==j
                sum+=m[i][m.length-i-1];     //i+j=n-1 -- sd trick --> j=n-1-i #we can find j along in a loop with this trick and thus add diagonal element sum
            }
            
        }
        System.out.println("sum: "+sum);
    }


    public static void main(String[] args) {
        int matrix[][]={{1,2,3},
                        {5,6,7},
                        {9,10,11},
                        };
        
        diagonalSum(matrix);
        diag_sum_2(matrix);
        
    }
}
