//preorder, postorder, inorder -- iterative,,,  being all dfs, stack is must her for iterative traversal

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class iterative_traversal {
  public static void main(String[] args) {
    /*
                    3
                  /   \
                 4     2            
                / \   / \
              -1   1 7   9
                  /
                 6
        */

        Node root = new Node(3);

        root.left = new Node(4);
        root.right = new Node(2);

        root.left.left = new Node(-1);
        root.left.right = new Node(1);

        root.right.left = new Node(7);
        root.right.right = new Node(9);

        root.left.right.left = new Node(6);

    System.out.println("Preorder: ");
    preorder(root);
    System.out.println("\nInorder: ");
    inorder(root);
    System.out.println("Postorder: ");
    postorder(root);
  }  

  //preorder 
  //use stack,,,,,,, put root node in stack,get & print node from stack , put its children in stack
  //in children , first put right child, then left child (stack based on lifo)
  public static void preorder(Node root) {
      Stack<Node> st=new Stack<>();
      st.add(root);
      while(!st.isEmpty()){
        Node curr=st.pop();
        System.out.print(curr.val+" ");
        if(curr.right!=null) st.add(curr.right); 
        if(curr.left!=null) st.add(curr.left); 
      }



  }   

  //inorder --- Morris Inorder    
  //use stack & curr Node,,,,,, 1. while (curr.left!=null) move curr & (6), print curr val (as when left==null), 2. move curr to right , 3. if left & right ==null - move curr back to stack top, print curr  4. when done with left , move curr to right

  //5. whenever there is some left, we have to add it to stack 
  //will generally be going to left only in loop
  //full intuition written from line 124
  
  public static void inorder(Node root){
    ArrayList<Integer> ans=new ArrayList<>();
    Stack<Node> st=new Stack<>();
    Node curr=root;  
    while(st.size()>0 || curr!=null){
      if(curr!=null) {           //curr!=null
        if(curr.left!=null){
        st.push(curr);
        curr=curr.left; 
        }
        else{
          ans.add(curr.val);
          curr=curr.right;
        }
      }

      else{        //curr==null
        curr=st.pop();
        ans.add(curr.val);
        curr=curr.right; 
      }
    }

    System.out.println(ans);
  }

  //postorder
  //postorder is actually reverse of reverse pre order (((reverse preorder -- Root Right Left)))
  //reverse preorder occurs automatically when we in stack, add left child first then right childx
  public static void postorder(Node root){
    ArrayList<Integer> ans=new ArrayList<>();
    Stack<Node> st=new Stack<>();
    st.add(root);
    while(!st.isEmpty()){
        Node curr=st.pop();
        ans.add(curr.val);
        if(curr.left!=null) st.add(curr.left);
        if(curr.right!=null) st.add(curr.right);
    }
    Collections.reverse(ans);
    System.out.println(ans);
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





// ITERATIVE INORDER TRAVERSAL USING STACK
//
// Inorder traversal means:
//
//     LEFT -> ROOT -> RIGHT
//
// Example:
//
//              1
//             / \
//            2   3
//           / \
//          4   5
//
// Inorder:
//
//     4 -> 2 -> 5 -> 1 -> 3
//
// ------------------------------------------------------------
//
// MAIN IDEA:
//
// In recursive inorder traversal, the system call stack
// automatically remembers the parent nodes.
//
// In iterative inorder traversal,
// we manually use a Stack<Node> to remember those nodes.
//
// We use two things:
//
//     1. curr -> current node we are processing
//     2. st   -> stack used to store nodes
//
// ------------------------------------------------------------
//
// CODE:
//
// ArrayList<Integer> ans = new ArrayList<>();
// Stack<Node> st = new Stack<>();
// Node curr = root;
//
// ans stores the inorder traversal.
//
// st stores nodes whose left subtree is being processed
// and whose value must be visited later.
//
// curr initially points to the root.
//
// ------------------------------------------------------------
//
// MAIN LOOP:
//
// while(st.size() > 0 || curr != null)
//
// Continue while:
//
//     curr != null
//     OR
//     stack is not empty
//
// Why both conditions?
//
// Case 1:
//
//     curr != null
//
// There is still a node to process.
//
// Case 2:
//
//     stack is not empty
//
// There are previously visited parent nodes
// waiting to be processed.
//
// If both curr is null and stack is empty,
// the complete traversal is finished.
//
// ------------------------------------------------------------
//
// CASE 1: curr != null
//
// if(curr != null) {
//
//     ...
//
// }
//
// This means we are currently standing on a valid node.
//
// We first try to go as far left as possible,
// because inorder traversal always processes
// the left subtree before the root.
//
// ------------------------------------------------------------
//
// CASE 1A: curr.left != null
//
// if(curr.left != null) {
//
//     st.push(curr);
//     curr = curr.left;
//
// }
//
// Suppose:
//
//          1
//         /
//        2
//
// At node 1:
//
//     curr = 1
//
// Since node 1 has a left child,
// we cannot process node 1 yet.
//
// Why?
//
// Because inorder requires:
//
//     left subtree first
//
// So we:
//
//     1. Push node 1 into the stack.
//     2. Move curr to node 2.
//
// Stack:
//
//     [1]
//
// curr:
//
//     2
//
// The stack remembers that node 1 must be processed
// after its left subtree is completed.
//
// ------------------------------------------------------------
//
// WHY DO WE PUSH curr BEFORE MOVING LEFT?
//
// Because after processing the left subtree,
// we need to come back to the current node.
//
// Example:
//
//          1
//         /
//        2
//
// If we move directly to 2 without storing 1,
// we will lose node 1.
//
// Therefore:
//
//     st.push(curr)
//
// saves the parent node for later.
//
// ------------------------------------------------------------
//
// CASE 1B: curr.left == null
//
// else {
//
//     ans.add(curr.data);
//     curr = curr.right;
//
// }
//
// If the current node has no left child,
// its left subtree is already completed.
//
// Therefore, we can process the current node immediately.
//
// Example:
//
//     2
//
// Since node 2 has no left child:
//
//     ans.add(2)
//
// Then move to its right child:
//
//     curr = curr.right
//
// If the right child is null,
// curr becomes null.
//
// This means we need to return to a parent node
// stored in the stack.
//
// ------------------------------------------------------------
//
// CASE 2: curr == null
//
// else {
//
//     curr = st.pop();
//     ans.add(curr.data);
//     curr = curr.right;
//
// }
//
// If curr is null,
// there is no current node to process.
//
// But the stack may contain a parent node
// whose left subtree has now been completed.
//
// So we:
//
//     1. Pop the most recent parent node.
//     2. Add its value to ans.
//     3. Move to its right subtree.
//
// This follows:
//
//     LEFT -> ROOT -> RIGHT
//
// ------------------------------------------------------------
//
// WHY POP AND PROCESS THE NODE?
//
// Suppose:
//
//          1
//         / \
//        2   3
//
// First, node 1 is pushed:
//
//     stack = [1]
//
// Then curr moves to node 2.
//
// Node 2 has no left child,
// so we add 2:
//
//     ans = [2]
//
// Then curr becomes null.
//
// Now stack is not empty,
// so we pop node 1:
//
//     curr = st.pop()  // node 1
//
// Add node 1:
//
//     ans = [2, 1]
//
// Then move to node 1's right child:
//
//     curr = 3
//
// Finally add 3:
//
//     ans = [2, 1, 3]
//
// ------------------------------------------------------------
//
// COMPLETE DRY RUN:
//
// Tree:
//
//              1
//             / \
//            2   3
//           / \
//          4   5
//
// Expected inorder:
//
//     4 2 5 1 3
//
// Initially:
//
//     curr = 1
//     stack = []
//     ans = []
//
// ------------------------------------------------------------
//
// ITERATION 1:
//
// curr = 1
//
// curr is not null.
// curr.left is not null.
//
// Push 1:
//
//     stack = [1]
//
// Move left:
//
//     curr = 2
//
// ans = []
//
// ------------------------------------------------------------
//
// ITERATION 2:
//
// curr = 2
//
// curr.left is not null.
//
// Push 2:
//
//     stack = [1, 2]
//
// Move left:
//
//     curr = 4
//
// ------------------------------------------------------------
//
// ITERATION 3:
//
// curr = 4
//
// curr.left is null.
//
// Add 4:
//
//     ans = [4]
//
// Move right:
//
//     curr = null
//
// ------------------------------------------------------------
//
// ITERATION 4:
//
// curr = null
// stack = [1, 2]
//
// Pop 2:
//
//     curr = 2
//
// Add 2:
//
//     ans = [4, 2]
//
// Move right:
//
//     curr = 5
//
// ------------------------------------------------------------
//
// ITERATION 5:
//
// curr = 5
//
// curr.left is null.
//
// Add 5:
//
//     ans = [4, 2, 5]
//
// Move right:
//
//     curr = null
//
// ------------------------------------------------------------
//
// ITERATION 6:
//
// curr = null
// stack = [1]
//
// Pop 1:
//
//     curr = 1
//
// Add 1:
//
//     ans = [4, 2, 5, 1]
//
// Move right:
//
//     curr = 3
//
// ------------------------------------------------------------
//
// ITERATION 7:
//
// curr = 3
//
// curr.left is null.
//
// Add 3:
//
//     ans = [4, 2, 5, 1, 3]
//
// Move right:
//
//     curr = null
//
// ------------------------------------------------------------
//
// Now:
//
//     curr == null
//     stack is empty
//
// Loop stops.
//
// Final answer:
//
//     [4, 2, 5, 1, 3]
//
// ------------------------------------------------------------
//
// THE TWO MAIN MOVEMENTS:
//
// 1. Going down:
//
//     while curr has a left child:
//
//         push curr
//         move curr to curr.left
//
//     This reaches the leftmost node.
//
// 2. Coming back up:
//
//     when curr becomes null:
//
//         pop a node
//         process it
//         move to its right child
//
// ------------------------------------------------------------
//
// SIMPLE WAY TO REMEMBER:
//
//     If curr exists:
//
//         If left child exists:
//             push curr
//             go left
//
//         Else:
//             process curr
//             go right
//
//     If curr is null:
//
//         pop from stack
//         process popped node
//         go right
//
// ------------------------------------------------------------
//
// WHY curr = curr.right AFTER PROCESSING?
//
// In inorder:
//
//     LEFT -> ROOT -> RIGHT
//
// Once the current node is processed,
// its left side and itself are completed.
//
// The only remaining part is its right subtree.
//
// Therefore:
//
//     curr = curr.right
//
// ------------------------------------------------------------
//
// WHY IS THE LOOP CONDITION OR (||) USED?
//
//     while(st.size() > 0 || curr != null)
//
// Suppose curr becomes null,
// but stack contains parent nodes:
//
//     curr = null
//     stack = [1, 2]
//
// We must continue,
// because those nodes still need to be processed.
//
// If we used only:
//
//     while(curr != null)
//
// the traversal would stop too early.
//
// ------------------------------------------------------------
//
// TIME COMPLEXITY:
//
// Every node is:
//
//     - pushed into the stack once
//     - popped from the stack once
//     - added to ans once
//
// Therefore:
//
//     Time Complexity = O(n)
//
// ------------------------------------------------------------
//
// SPACE COMPLEXITY:
//
// The stack can contain at most h nodes,
// where h is the height of the tree.
//
// Therefore:
//
//     Auxiliary Space = O(h)
//
// Balanced tree:
//
//     O(log n)
//
// Skewed tree:
//
//     O(n)
//
// The answer list itself stores n nodes:
//
//     Output Space = O(n)
//
// ------------------------------------------------------------
//
// RECURSIVE VS ITERATIVE INORDER:
//
// Recursive:
//
//     The system call stack stores parent nodes.
//
// Iterative:
//
//     We manually store parent nodes
//     using Stack<Node>.
//
// Both have:
//
//     Time = O(n)
//     Auxiliary Space = O(h)
//
// ------------------------------------------------------------
//
// FINAL SUMMARY:
//
// This code performs inorder traversal without recursion.
//
// It manually simulates the recursive call stack.
//
// The stack stores nodes while we move left.
//
// When there is no left node:
//
//     process the node
//     move right
//
// When curr becomes null:
//
//     pop the stored parent
//     process it
//     move right
//
// CORE PATTERN:
//
//     Go left while possible.
//     Store parents in stack.
//     Process node when left is completed.
//     Then move right.
//
// INORDER:
//
//     LEFT -> ROOT -> RIGHT