
import java.util.LinkedList;
import java.util.Queue;

//FIFO (first in first out ) concept    //front ,,, rear   view of queue

//Queue operations -- peek, add(val), remove ((all possible only on first element/front element of queue except add which is implied on to rear of queue))    --- can't access any other element.. i.e. remove & peek operations can be performed on only first/front element and add on from rear

//size() --> for to return size of queue



// Queue<Integer> q=new LinkedList<>();  or new ArrayDeque<>()    // ((have to import LinkedList or ArrayDeque if using --- abstract class, doubly linkedlist implementation))
//Queue Operations  --- 
  // q.add(val);   --- add element to front  
  // q.peek()  ---- returns front-most element
  // q.remove() --- remove front-most element

  //Each have T.C= O(1)
  
  // we can print whole stack tho directly, similar to arraylist (just, T.C= O(n))


public class queue{
  public static void main(String[] args) {
      Queue <Integer> q=new LinkedList<>();

      q.add(10);  q.add(20); q.add(30); 
      System.out.println(q);
      System.out.println(q.peek());
      q.remove();
      System.out.println(q+" "+q.size());
  }
}





