class MyArrayList{  //user defined data strcuture
    int arr[];
    int idx;   //default value=0
    int size;  //default value=0

    MyArrayList(int capacity) {
        arr=new int[capacity];
    }

    void add(int ele){     //add function as of arrayList
        if(idx==arr.length){
            capacityIncrease();
        }
        arr[idx++]=ele;
        size++;
    }
    void capacityIncrease(){
        int arr2[]=new int[arr.length*2];
            for (int i = 0; i < arr.length; i++) {
                arr2[i]=arr[i];
            }
            arr=arr2;   //now arr is not arr, it has become arr2; ***
    }
    void remove(int i){
        idx=i;
        size--;
        for(int j=i;j<arr.length-1;++j){
            arr[idx]=arr[idx+1];
            idx++;
        }

    }
    int get(int i){
        return arr[i];
    }
    int capacity(){
        return arr.length;
    }
    void display(){
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}


public class OwnArrayList{
    public static void main(String[] args) {
        MyArrayList arr=new MyArrayList(3);
        arr.add(20); arr.add(30); arr.add(40);
        System.out.println(arr.size);
        arr.display();
        System.out.println(arr.get(2));
        // arr.add(50); //will lead to error incase of no capcity increase alongwith addition of elements
        arr.add(50);
        System.out.println(arr.capacity());
        arr.remove(2);
        arr.display();
        System.out.println(arr.size);
    }
}


//for if u are making another classes that too above the class with main method, you have to compile & run in different classes
