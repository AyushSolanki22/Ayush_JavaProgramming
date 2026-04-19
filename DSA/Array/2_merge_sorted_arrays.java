// ((concept written))

package DSA.Array;

class merge_sorted_arrays {

    public static void main(String[] args) {
        int a[]={2,5,6,9,20};
        int b[]={1,3,4,5,7,8};

        int c[]=new int[a.length+b.length];
        merge(c,a,b);
        for(int ele : c){
            System.out.print(ele+" ");
        }


    }

    public static void merge(int c[],int a[],int b[]) {
        int i=0;
        int j=0;
        int k=0;

        while(i<a.length && j<b.length){
            if(a[i]>=b[j]) {
                c[k]=b[j];      //or c[k++]=a[i++]  (post increment concept)
                ++j; 
                ++k;

            }
            else{
                c[k]=a[i];
                ++i;
                ++k;
            }
            

        }
        while(i<a.length){
            c[k++]=a[i++];
        }
        while(j<b.length){
            c[k++]=b[i++];
        }
    }
}

//Homework - do merge  opposite from last of c , last of a& b;
// package DSA.Array;

// class merge_sorted_arrays {

//     public static void main(String[] args) {
//         int a[]={2,5,6,9,20};
//         int b[]={1,3,4,5,7,8};

//         int c[]=new int[a.length+b.length];
//         merge(c,a,b);
//         for(int ele : c){
//             System.out.print(ele+" ");
//         }


//     }

//     public static void merge(int c[],int a[],int b[]) {
//         int i=a.length-1;
//         int j=b.length-1;
//         int k=c.length-1;

//         while(i>=0 && j>=0){
//             if(a[i]>=b[j]) {
//                 c[k]=a[i];      //or c[k++]=a[i++]  (post increment concept)
//                 --i; 
//                 --k;

//             }
//             else{
//                 c[k]=b[j];
//                 --j;
//                 --k;
//             }
            

//         }
//         while(i>=0){
//             c[k--]=a[i--];
//         }
//         while(j>=0){
//             c[k--]=b[j--];
//         }
//     }
// }