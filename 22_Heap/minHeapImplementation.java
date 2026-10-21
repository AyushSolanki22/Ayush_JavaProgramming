//Implementing heap using array -- ((index game -- not using 0th index  ---- remember array representation of heap using 1-based indexing)) 
//root= i, leftChild=2*i , rightChild=2*i+1

import java.util.Arrays;

public class minHeapImplementation{
  public static void main(String[] args) {
      Heap h=new Heap(10);

      h.add(10);  h.add(15); h.add(8); h.add(9); h.add(4);
      h.display();
      System.out.println();
      System.out.println(h.remove());
      h.display();
      h.add(2);
      System.out.println();
      h.display();
      System.out.println();
      System.out.println(h.remove());
      h.display();
  }
}



//add, remove each has 2 works -- add/remove, rearrange elements
//for add, rearrange -- upar jaana   ((parent = i/2))
//for remove, rearrange -- downwards jaana ((left, right childs ke min se swap krte and all))
class Heap{
  int arr[];
  int idx=1; 
  int peek(){
    if(size()==0) {
      System.out.println("Heap is Empty");
      return -1;
    }
    return arr[1];
  }
  int size(){
    return idx-1;
  }
  Heap(int capacity){
    arr=new int[capacity+1];  //1th based indexing
    Arrays.fill(arr, Integer.MAX_VALUE);
  }

  void add(int ele){
    if(idx==arr.length){
      System.out.println("Heap is FULL");
      return;
    }
    arr[idx++]=ele;
    //rearrangement
    int root=idx-1;
    while(root!=1){
      int parent=root/2;  //parent index

      if(arr[root]<arr[parent]){ //swap condition
        int temp=arr[root];
        arr[root]=arr[parent];
        arr[parent]=temp;
        
        root=parent;
      }
      else break; 
    }
  }

  void display(){
    for(int i=1; i<idx; ++i){
      System.out.print(arr[i]+" ");
    }
  }

  int remove(){
    if(idx==1) {
      System.out.println("Heap is Empty");
      return -1;
    }

    int min=arr[1];
    arr[1]=arr[idx-1];
    idx--;

    //rearrangement
    int root=1;
    while (root<=size()) { 
      int left=2*root, right=2*root+1;
      int leftVal=(left<=size())? arr[left]: Integer.MAX_VALUE;int rightVal=(right<=size())? arr[right]: Integer.MAX_VALUE;

      if(arr[root]<leftVal && arr[root]<rightVal) break;
      else{
        if(leftVal <rightVal){  //left child se swap krna hai 
          int temp=arr[left];
          arr[left]=arr[root];
          arr[root]=temp;

          root=left;
        } 
        else{    //right child se swap krna hai 
          int temp=arr[right];
          arr[right]=arr[root];
          arr[root]=temp;

          root=right;
        }
      }
    }
    return min;
  }


}

