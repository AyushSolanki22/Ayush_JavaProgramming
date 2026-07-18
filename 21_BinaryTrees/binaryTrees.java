//Binary Tree Implementation 
//+
//Traverse (with root node only)

public class binaryTrees {
  public static void main(String[] args) {
    //     3
    //    /  \
    //   4    2 
    //  /  \ / \
    //-1   1 6  9 

    Node a=new Node(3);
    Node b=new Node(4);
    Node c=new Node(2);
    Node d=new Node(-1);
    Node e=new Node(1);
    Node f=new Node(6);
    Node g=new Node(9);
    a.left=b;   a.right=c;
    b.left=d;   b.right=e;
    c.left=f;   c.right=g;

    display(a);
  }  

  //display with the helo of recursion
  public static void display(Node root) {
      if(root==null){
        return;
      }
    
      System.out.print(root.val+" ");
      display(root.left);  //left subtree will be printed as a whole 
      display(root.right); //right subtree will be printed as a whole 
      
      //understand concept of recursion applying here to traverse

      //6 ways to get the bianry tree traversed and printed  ((Maths --> 3! rearrange recursive code ))

  }
}


class Node{
  int val; 
  Node left; 
  Node right; 
  Node (int val){
    this.val=val;
  }
}
