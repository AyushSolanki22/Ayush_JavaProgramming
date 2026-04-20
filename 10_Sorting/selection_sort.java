//selection sort - pick the smallest(from unsorted) ,& put it at the beginning of the array.

public class selection_sort {
//     public static void selSort(int num[]) {
//         int n=num.length;
//         int currMin=0;
//         for (int i=0; i<=n-2; ++i) {
//             // int minNum=Integer.MAX_VALUE;  //minNum value is to be resetted every time;***###
//             int index=i;    
//             for (int j=i+1; j<=n-1; ++j) {  //unsorted array-start --> i+1
//                  currMin=num[j];
//                  if (currMin<minNum) {   //finding min
//                     index=j;
//                     minNum=currMin;
//                  }
//             }
//             //swap
//             int temp=num[i];
//             num[i]=minNum;
//             num[index]=temp;

//         }

//     }
//     public static void selsort(int num[]) {
//         int n=num.length;
//         for(int i=0; i<=n-2;++i){
//             int minPos=i;
//             for(int j=i+1; j<=n-1; ++j){
//                 minPos=(num[j]<num[minPos])? j:minPos;

//         }
//         ///swap
//         int temp=num[i];
//         num[i]=num[minPos];
//         num[minPos]=temp;
        
//     }
// }
//     public static void main(String[] args) {
//         int num[]={5,4,1,3,2};

//         selsort(num);






//         //output
//         for (int i=0; i<num.length; ++i) {
//             System.out.println(num[i]);
//         }
//     }


// }

//best SELECTION SORT APPROACH (DSA)
public static void main(String[] args){
    int arr[]={5,-2,6,7,2,0,7,2};
    int n=arr.length;
    for(int i=0; i<n-1; ++i){             //same no. of passes as similar to that of bubble sort(n-1)passes 
        int min=Integer.MAX_VALUE;
        int minidx=-1;     //we also need minimum element index as well to have swapped elements(index is necessary for swapping)
        for(int j=0; j<n;j++){
            if(arr[j]<min){
                min=arr[j];
                minidx=min;
            }
        }
        //swap
        int temp=min;
        arr[minidx]=arr[i];
        arr[i]=temp;
    } 

}




}