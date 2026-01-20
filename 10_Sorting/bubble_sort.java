//{5,4,1,3,2} -- unsorted array
//either sorting in increasing or decreasing order...

//bubble sort idea- large elements come to the end of an array by swapping with adjacent elements.
//it is consequently comparing one element with other one by one until that largest number doesn't has any small number in right next to it.

//no. of turns =4;
public class bubble_sort {
    public static void bubbleSort(int num[]) {
        int n=num.length;
        int temp=0;
        int swaps=0;
        for (int turn=0; turn<=n-2; ++turn) {
            for (int j=0; j<=n-2-turn; ++j) {
               if (num[j]>num[j+1]) {
                temp=num[j];
                num[j]=num[j+1];
                num[j+1]=temp;
                ++swaps;
               }
            }
        }
        //Time complexity nearly= n^2;
        System.out.print("Sorted Array: ");
        for (int i=0; i<n; ++i) {
            System.out.print(num[i]+" ");
        }
        System.out.println("\nSwaps: "+swaps);
    }
    public static void main(String[] args) {
        int num[]={5,4,1,3,2};

        bubbleSort(num);
    }
}
