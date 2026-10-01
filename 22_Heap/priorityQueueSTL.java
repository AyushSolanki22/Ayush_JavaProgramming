import java.util.*;

public class priorityQueueSTL {
  public static void main(String[] args) {
    //heap is a data structure which is used to implement priority queue.
    //heap is a complete binary tree, where each node is greater than or equal to its children (max heap) or less than or equal to its children (min heap).
    //heap is used in heapsort algorithm, priority queue, and graph algorithms like Dijkstra's algorithm.

    //heap is implemented using array, where the parent node is at index i, the left child is at index 2*i + 1, and the right child is at index 2*i + 2.
    //heap can be implemented using priority queue in java.
    PriorityQueue<Integer> pq = new PriorityQueue<>(); //min heap
    pq.add(10);
    pq.add(20);
    pq.add(15);
    System.out.println(pq.peek()); //10
    pq.remove();
    System.out.println(pq.peek()); //15

    //when printing the whole priority queue, it will print the heap in level order traversal
  }
}
