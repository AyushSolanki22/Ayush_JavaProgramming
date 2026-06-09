//Cyclic Sort - a algorithm working on specific cases only certainly
//Lot of swappings happen in it like bubble sort , so also knowns as swapping sort

//Where applied : when elements in the array are from 0 to n-1 
//Also applicable on array elements from 1 to n , from 0 to n

//Concept - element at ith element should be equal to its index(incase of elements from 0) or equal to index+1 (incase of elements from 1)

//T.C = O(n)


//Missing in array ( leetcode - [0,n], gfg-[1,n] )
//One Approach -- direct : expected sum-arraySum
//Another Approach -- After all swapping , at some certain index, it will not follow the core concept , that index would lead to get the missing number , + corner case 

//Duplicate number (leetcode)
//One approach - direct: arraySum-expected sum
//Another approach -- Cyclic Sort based solution

//ArrayDuplicates (gfg)
//Only one approach possible -- Cyclic sort based solution -- one loop for cyclic sort, another for checking & adding duplicate member



//Questions based on it:
//missing num, find all disappeared elements, find the duplicate member, set mismatch, first missing positive



//Code
public class cyclicSort{
    //elements from 1 to n
    public static void main(String[] args) {
        int arr[]={5,7,3,2,1,6,8,4};
        cyclicSort(arr);
        for(int i=0; i<arr.length;++i){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    static void cyclicSort(int arr[]){
        int i=0;
        while(i<arr.length){
            if(i+1==arr[i]) i++;
            else{
                int idx=arr[i]-1;
                if(idx>=arr.length){
                    i++;
                    continue;
                }
                swap(i,idx,arr);
            }
        }
    }
    static void swap(int i,int j, int arr[]){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp; 
    }
}