import java.util.*; //or java.util.* which is used for importing all packages.
public class inbuilt_sort {
    public static void inbuiltSort(Integer a[]) {
        Arrays.sort(a);
        for (int i=0; i<a.length; ++i) {
            System.out.println(a[i]);
        }
        //Arrays.sort(arr, si, ei); --> ei not inclusive.
        //time complexity -- 0(n logn) < 0(n^2) which is of bubble, selection sort

        //if we want to do specified sorting like in reverse order, then we use
        Arrays.sort(a,Collections.reverseOrder());  //it expects array in Integer[] which is the wrapper class for int, not int[].
        //as int[] is a primitive array, and Java's Collections.reverseOrder() needs objects that can be compared via Comparator.


    }
    public static void main(String[] args) {
        Integer arr[]={5,4,1,3,2};

        inbuiltSort(arr);
    }
}
