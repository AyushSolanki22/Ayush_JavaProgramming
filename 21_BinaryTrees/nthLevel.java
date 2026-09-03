public class nthLevel {
  public static void main(String[] args) {
    Node root=new Node(1);

    root.left=new Node(2);
    root.right=new Node(3);
    root.left.left=new Node(4);
    root.left.right=new Node(5);
    root.right.left=new Node(6);
    root.right.right=new Node(7);

    printNth(root,1,3);
  }

  public static void printNth(Node root, int level, int n){
    //pre-order traversal 
    //just printing with a condition

    if(root==null) return;

    if(level==n) System.out.print(root.val+" ");

    printNth(root.left, level+1, n);
    printNth(root.right, level+1, n);
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