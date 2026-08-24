//BFS - breadth first search 

//level order traversal 

import java.util.*;

class levelOrderTraversal {

    // Level Order Traversal (BFS)
    public static void levelOrder(Node root) {

        if (root == null)
            return;

        Queue<Node> q = new LinkedList<>();

        q.add(root);

        while (!q.isEmpty()) {

            Node curr = q.remove();

            System.out.print(curr.data + " ");

            if (curr.left != null)
                q.add(curr.left);

            if (curr.right != null)
                q.add(curr.right);
        }
    }

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

        System.out.println("Level Order Traversal:");

        levelOrder(root);
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