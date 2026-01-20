//Basically, Approach is like based on border, first outer boundary , then inner one 
//First - variables initialisation, then loops based on column, rows - top ,right, bottom, left (for to print), special condition(sc==ec, sr==er)
public class spiral_matrix {
    public static void printSpiral(int m[][]) {
        int sr=0,er=m.length-1,sc=0,ec=m[0].length-1;

        while (sr<=er && sc<=ec) { //boundary  //less than or equal to is much necessary to avoid errors or double time printing in case of odd order and (matrices which are not square )
            //top
            for (int j=sc; j<=ec; ++j) {
                System.out.print(m[sr][j]+" ");
            }
            //right
            for (int i=sr+1; i<=er; ++i) {
                System.out.print(m[i][ec]+" ");
            }
            //bottom
            for (int j=ec-1; j>=sc; --j) {
                if (sr==er) {
                    break; //incase of a odd rows & columns which can lead to double time printing.(similar to top)
                }
                System.out.print(m[er][j]+" ");
            }
            //left
            for (int i=er-1; i>=sr+1; --i) {
                if (sc==ec) {
                    break; //incase of a odd rows & columns which can lead to double time printing(similar to right)
                }
                System.out.print(m[i][sc]+" ");
            }
            sc++;
            sr++;
            ec--;
            er--;

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};                        
        
        printSpiral(matrix);

    }
}