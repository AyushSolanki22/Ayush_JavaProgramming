import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;


public class zigzagTraversal{
  public static void main(String[] args){
    Node root=new Node(1);

    root.left=new Node(2);
    root.right=new Node(3);
    root.left.left=new Node(4);
    root.left.right=new Node(5);
    root.right.left=new Node(6);
    root.right.right=new Node(7);

    zigzagTraversal(root);
  }

  public static ArrayList<ArrayList<Integer>> zigzagTraversal(Node root){

    ArrayList<ArrayList<Integer>> ans=new ArrayList<>();

    Queue<Node> q=new LinkedList<>();
    q.add(root);
    int levelNo=1;
    while(!q.isEmpty()){
      ArrayList<Integer> level=new ArrayList<>();

      int levelSize=q.size();

      for(int i=1; i<=levelSize; ++i){
        Node curr=q.remove();

        level.add(curr.val);

        if(curr.left!=null){
          q.add(curr.left);
        }
        if(curr.right!=null){
          q.add(curr.right);
        }

        if(i==levelSize) {
          if(levelNo%2==0){
            Collections.reverse(level);
          }

          ans.add(level);
          levelNo++;
        }
      }

    }
    System.out.println(ans);
    return ans;
  }
}


class Node{
  int val;
  Node left;
  Node right;
  Node(int val){
    this.val=val;
    this.left=null;
    this.right= null;
  }
}