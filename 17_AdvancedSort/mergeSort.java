//T.c =0(nlogn)

//Merge Sort using Magic
    //Technique--> Divide & Conquer

//Step 1 -- make 2 empty arrays, one of size n/2 and n-(n/2) each 
//Step 2 -- copy paste original array elements to them   (sizes considering both odd and even no. of terms cases)
//Step 3 -- get the both arrays sored (recursion magic)
//Step 4 -- merge this sorted arrays to the original array  (merge 2 sorted arrays)

public class mergeSort{
    public static void main(String[] args) {
        int arr[]={5,2,8,4,1,6,7,3};
        MergeSort(arr);

        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    private static void MergeSort(int arr[]){
        int n=arr.length;
        //Base case
        if(n==1) return; //1 length array is already sorted

        //Step 1
        int a[]=new int[n/2];
        int b[]=new int[n-n/2];

        //Step2
        int idx=0;  //idx will traverse through arr
        for(int i=0;i<a.length;++i) a[i]=arr[idx++];
        for(int i=0;i<b.length;++i) b[i]=arr[idx++];

        //Step 3
        MergeSort(a);
        MergeSort(b);

        //Step 4
        merge(arr,a,b); //recursion back loop -- merge the sorted arrays

    }
     public static void merge(int c[],int a[],int b[]) {  //merge two sorted arrays
        int i=0,j=0, k=0;

        while(i<a.length && j<b.length){
            if(a[i]>=b[j]) {
                c[k]=b[j];      //or c[k++]=a[i++]  (post increment concept)
                ++j; 
            }
            else{
                c[k]=a[i];
                ++i;
            }
            ++k;
        }
        while(i<a.length) c[k++]=a[i++];
        while(j<b.length) c[k++]=b[j++];
    }

}

//Time Complexity & Space Complexity 
// On each level, n+n=~n operations (arr length) are taking place in copying & pasting elements , & merging all arrays in each and every cell 
// 1st call (from main) -- n operations, 2nd call -- n/2+n/2 -- n operations, 3rd call -- n/4+n/4+n/4+n/4 operations -- n operations 

// No. of levels : from top : n, n/2, n/4 ....1 element ,,,, total no. of terms= log²n = total no. of levels
// Overall totat time complexity : total operations*total no. of levels =  O(n*logn)


//Auxiliary Space is also : O(nlogn) 
//In java, it can't be improved. But in C++, it is improved by deleting the arrays in recursion back loop -- Only O(n) A.S. then
// So in java, we study inplace-merge sort then.




// Count Inversions concept
//while merging arrays , the divided arrays still corresponds to i<j or that part that was divided from the main original array infact 
//so while merging,not after merging, the count of inversions can be calculated
//Also, simply while before merging: count+=a.length-i

