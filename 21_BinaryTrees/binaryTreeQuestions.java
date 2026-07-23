// in all questions,,, consider root, left subTree, right subTree to solve questions using recursion magic
// size, sum, product, maximum & minimum 

public class binaryTreeQuestions {
  public static void main(String[] args) {
    //   3
    //  /  \
    //  4    2
    // / \  / \
    //-1 1  6  9

    Node a = new Node(3);
    Node b = new Node(4);
    Node c = new Node(2);
    Node d = new Node(-1);
    Node e = new Node(1);
    Node f = new Node(6);
    Node g = new Node(9);
    a.left = b;
    a.right = c;
    b.left = d;
    b.right = e;
    c.left = f;
    c.right = g;

    System.out.println(getSize(a));
    System.out.println(sumBT(a));
    System.out.println(findMax(a));
    System.out.println(findMin(a));

  }

  static int getSize(Node root) {   //root size + left tree size + right tree size (leftTree, rightTree size using recursion magic)
    // with a basecase root==null returning 0 so as not to interfere 
    if (root == null)
      return 0;

    return 1 + getSize(root.left) + getSize(root.right);
  }

  static int sumBT(Node root) {   //root sum+ leftTree sum + rightTreeSum,,, with a basecase root==null returning 0 so as not to interfere 
    if (root == null)
      return 0;

    return root.val + sumBT(root.left) + sumBT(root.right);
  }

  public static int findMax(Node root) {  //finding max from root, left subtree, right subtree,,,, with a basecase root==null returning Integer.MIN_VALUE so as not to interfere 
    // code here
    if (root == null)
      return Integer.MIN_VALUE;

    return Math.max(root.val, Math.max(findMax(root.left), findMax(root.right)));
  }

  public static int findMin(Node root) {
    if (root == null)
      return Integer.MAX_VALUE;

    return Math.min(root.val, Math.min(findMin(root.left), findMin(root.right)));
  }
}

class Node {
  int val;
  Node left;
  Node right;

  Node(int val) {
    this.val = val;
  }
}