public class array_reverse {
    public static void arrayReverse(int num[]) {
        int first=0, last=num.length-1;
        
        while(first<last) {
            // swap
            int temp=num[last];
            num[last]=num[first];
            num[first]=temp;
            first+=1;
            last-=1;
        }
    }
    public static void main(String[] args) {
        //to make another array and add items through reverse looping, and copy-- time & space complexities increase.
        
        //Optimised approach
        //swap values in a array itself -- for eg. first and last---- not making addtl. array
        int num[]={1,4,3,4};

        arrayReverse(num);
        for (int i=0; i<num.length; ++i) {
            System.out.print(num[i]+" ");
        }
        //here, in this optimised approach --> Time complexity(n), Space complexity(1) - constant

    }
}

//array reverse ke liye for loop bhi lagake kar skte , swapping elements till n/2;