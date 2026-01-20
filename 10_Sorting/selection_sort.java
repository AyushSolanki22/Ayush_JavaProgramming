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
    public static void selsort(int num[]) {
        int n=num.length;
        for(int i=0; i<=n-2;++i){
            int minPos=i;
            for(int j=i+1; j<=n-1; ++j){
                minPos=(num[j]<num[minPos])? j:minPos;

        }
        ///swap
        int temp=num[i];
        num[i]=num[minPos];
        num[minPos]=temp;
        
    }
}
    public static void main(String[] args) {
        int num[]={5,4,1,3,2};

        selsort(num);






        //output
        for (int i=0; i<num.length; ++i) {
            System.out.println(num[i]);
        }
    }


}