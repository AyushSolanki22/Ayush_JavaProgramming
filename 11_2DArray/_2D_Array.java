//1D,2D,3D ,,,,,,,n-D(used for ML)
//2D Arrays -- are like matrix (row,cols);
//real life example- subject wise stuents marks, RGB Matrix, 4-D(videos)

//representation


//Creation of 2D Arrays
//can also be created as nested array , int[]={{},{}}
import java.util.*;
public class _2D_Array {
    //search feature;
    public static boolean search(int m[][],int key) {
        for (int i=0; i<m.length; ++i) {
            for (int j=0; j<m[0].length; ++j) {
                if (m[i][j]==key) {
                    System.out.println("found at cell ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.err.println("key not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][]=new int[3][3];  //just two double square brackets are used in this. //cells=3*3=9.
        int n=matrix.length,m=matrix[0].length;

        //input
        Scanner sc=new Scanner(System.in);
        //we take input row-wise firstly and then column wise.-- standard
        for (int i=0; i<n; ++i) {
            for (int j=0; j<m; ++j) {
                matrix[i][j]=sc.nextInt();
            }
        }

        //output
        for (int i=0; i<n; ++i) {
            for (int j=0; j<m; ++j) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        //search
        search(matrix,1);
        
    }
}

//2D Arrays in Moemory
// --> not stored as like that in linear arrays (1-D).
// It can be stored in memory as row major fashion (row1, row2, row3) or column major fashion (col1,col2,col3)
//But java has a different system of storing it in memory -it has tree type structure(not in contigous type somewhat)