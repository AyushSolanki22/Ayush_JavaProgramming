//Morris Traversal ---- efficient inorder traversal
//***** imp. for interviews
//T.C=0(n),, A.S=0(1) **


//Concept of Linking and unlinking
//For this, we need inorder predecessor

//preorder, postorder, inorder -- iterative,,,  being all dfs, stack is must her for iterative traversal

public class morris_traversal {
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

    System.out.println("\nInorder: ");
    inorder(root);
  }  

  
  //morris traversal A.S=0(1)
  public static void inorder(Node root){
    Node curr=root; 
    while(curr!=null){
      if(curr.left!=null){
        //(((find pred, link, unlink & print)))

        //find predecessor
        //pred.right=curr   (as there is no right to prev earlier)
        //curr=curr.left

        //((fake connections' work is to not get the curr to null, and traverse inorder))
        //check for fake connection, if pred.right==curr , destroy fake connection, print curr, curr=curr.right ((similar to else statements))
        Node pred=curr.left;
        while(pred.right!=null && pred.right!=curr) pred=pred.right; 
        
        if(pred.right!=curr){    //link
          pred.right=curr;
          curr=curr.left;
        }
        else{        //unlink & printing
          pred.right=null;   
          System.out.print(curr.data+" ");
          curr=curr.right;
        }

      }
      else{
        System.out.print(curr.data+" ");
        curr=curr.right;
      }
    }
  }

}



class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}