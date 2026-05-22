public class questions {

    //question 1 (To print 2D Array column wise)
    public static void main(String[] args) {

        int arr[][]={{9,5,4,3,2},{1,3,2,4,5},{7,6,3,4,5}};

        //just to print col wise (outer loop- column wise)
        for(int j=0;j<arr[0].length;++j){
            for(int i=0;i<arr.length;++i){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        question2(arr);
        question3(arr);
        question4();

    }

    //question 2 (To print 2D Array in snake pattern )
    public static void question2(int arr[][]){
        int i=0,j=0;
        while(i<arr.length){
            if(i%2==0){
                System.out.print(arr[i][j]+" ");
                j++;
                if(j==arr[0].length){
                    i++;
                    j--;
                }
            }
            else{
                System.out.print(arr[i][j]+" ");
                j--;
                if(j==-1) {
                    j=0;
                    i++;
                }
            }
        }
        System.out.println();
        System.out.println();
    }

    //question 3 (Reverse all rows of a given matrix & then reverse col's)
    public static void question3(int arr[][]) {

        for(int i=0;i<arr.length;++i){
            int j=0,k=arr[0].length-1;
            while(j<k){
                
                int temp=arr[i][j];
                arr[i][j]=arr[i][k];
                arr[i][k]=temp;
                j++;
                k--;
            }

        }
        for(int j=0;j<arr[0].length;++j){
            int i=0,k=arr.length-1;
            while(i<k){
                int temp=arr[i][j];
                arr[i][j]=arr[k][j];
                arr[k][j]=temp;
                i++;
                k--;
            }
        }
        for(int i=0;i<arr.length;++i){
            for(int j=0;j<arr[0].length;++j){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
    }

    //question 4 (Transpose of Matrix originally)
    public static void question4() {

        int arr[][]={{2,8,3,4},{7,2,1,6},{5,5,4,1},{3,1,8,2}};
        for(int j=0;j<arr.length;++j){
            for(int k=j;k<arr.length;++k){
                int temp=arr[k][j];
                arr[k][j]=arr[j][k];
                arr[j][k]=temp;
            }

        }

        // for(int i=0;i<arr.length;++i){
        //     for(int j=0;j<arr.length;++j){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        
        //to print using for each loop **
        for(int a[]:arr){
            for(int ele:a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
