

public class insertion_sort {
    public static void insertionSort(int arr[]) {
        int n=arr.length;
        for (int i=1; i<=n-1; ++i) {
            int cur=i;
            for (int prev=i-1; prev>=0; --prev) {
                if (arr[prev]>arr[cur] ) {
                    int temp=arr[cur];
                    arr[cur]=arr[prev];
                    arr[prev]=temp;
                }
                --cur;       //it is because as the current element gets swapped to i-1 th index and also  need to be compared with adjacent previous element
          }
        }
        // Arrays.sort(arr);
        for (int i = 0; i <n; i++) {
         System.out.println(arr[i]);   
        }
    
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        
        insertionSort(arr);
    }
}
