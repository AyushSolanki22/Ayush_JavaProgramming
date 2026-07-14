//Queue Implementation via Array
//little bit tough

//Queue is like implemented due to its different shape, prop

//For a array, 2 variables are used to implement via Array -- front(f), rear(r)
//initially, both at 0th idx


//1. Concept -- our queue is from f to r-1

//add(val) --> arr[r++]=val;
//remove --> f++

//limitation -- as array is of fixed size only, due to this the array cannot be utilised fully (due to remove features)



//2. Concept -- using circular, size variable -- utilising full array for queue elements

public  class ArrayImplementationOfQueue{  //circular Array
  public static void main(String[] args) {
    CircularQueue q=new CircularQueue(5);
    q.add(10);
    q.add(20);
    q.add(30);
    q.display();
    q.add(40);
    q.add(50);
    q.display();
    q.remove();
    q.remove();
    q.display();
    q.add(20);
    q.add(30);
    q.display();

  }
}


class CircularQueue{
  int arr[];   
  int f;    int r;    int size;
  
  CircularQueue(int capacity){
    arr=new int[capacity];
  }

  void add(int val){
    if(size==arr.length)  {
      System.out.println("Queue is full");
      return;
    }

    arr[r++]=val;
    if(r==arr.length) {
      r=0;
    }
    size++;
  }

  int remove(){
    if(size==0){
      System.out.println("Queue is empty");
      return -1;
    }
    int frontVal=arr[f];
    f++;
    if(f==arr.length) f=0;
    size--;
    return  frontVal;
  }

  void display(){
    if(size==0)  return;   //f & r at same index

    if(f>=r){
      for(int i=f; i<arr.length; ++i){   //front to end
        System.out.print(arr[i]+" ");
      }
      for(int i=0; i<r; ++i){       //start to rear-1
        System.out.print(arr[i]+" ");
      }
    }
    else{
      for(int i=f; i<r; ++i){       // front to rear-1 
        System.out.print(arr[i]+" ");
      }
    }

    System.out.println();

  }
}