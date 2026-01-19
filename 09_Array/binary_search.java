// Example -- finding a word in dictionary
//prerequisite - sorted arrays.

public class binary_search {
    public static int  binarySearch(int num[], int key) {
        int start=0, end=num.length-1;
        while (start<=end) {
            int mid=(start+end)/2;
            //comparisons
            if (key==num[mid]) {
                return mid;
            }
            else if (key>num[mid]){  //right
                start =mid+1;
            }
            else if(key<num[mid]) {  //left
                end=mid-1;
            }

        }
        return -1;
        
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10,12,14,16};
        int key=16;

        int index=binarySearch(num, key);

        if (index==-1) {
            System.out.println("Not found");
        }
        else {
             System.out.println("Key is at index: "+ index);
        }
        
    }
}
