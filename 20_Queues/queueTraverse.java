
import java.util.LinkedList;
import java.util.Queue;

//we can traverse through queue (without a limitation like that of stack to have store elements in a auxiliary space somewhat)
//we can traverse a queue in loop of size() , removing element (at front) ,, adding that element itself (which will be added at rear) ,,, after full traversal , queue will remain same,, thus no problem as such like stacks

public class queueTraverse{
  public static void main(String[] args) {
      Queue<Integer> q=new LinkedList<>();

      q.add(10); q.add(20); q.add(30); q.add(40);

      for(int i=1; i<=q.size(); i++){
        // int ele=q.remove();
        // System.out.print(ele+" ");
        // q.add(ele);
        System.out.print(q.peek()+" ");
        q.add(q.remove());
      }
  }
}