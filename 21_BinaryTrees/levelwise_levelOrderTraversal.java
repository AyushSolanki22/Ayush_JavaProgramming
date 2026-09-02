import java.util.*;

class LevelOrder {

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

        levelOrder(root);
    }

    static void levelOrder(Node root) {

        if(root == null)
            return;

        Queue<Pair> q = new LinkedList<>();

        // Root is at Level 1
        q.add(new Pair(root, 1));

        int prevLevel = 1;

        while(!q.isEmpty()) {

            Pair p = q.remove();

            Node curr = p.node;
            int level = p.level;

            // Level changed -> move to next line
            if(level != prevLevel)
                System.out.println();

            // Print current Node
            System.out.print(curr.data + " ");

            // Add children with next level
            if(curr.left != null)
                q.add(new Pair(curr.left, level + 1));

            if(curr.right != null)
                q.add(new Pair(curr.right, level + 1));

            prevLevel = level;
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

class Pair {

    Node node;
    int level;

    Pair(Node node, int level) {
        this.node = node;
        this.level = level;
    }
}



//Second approach (((without using concept of Pair)))

// while(!q.isEmpty()) {

//     int currLevel = q.size();

//     for(int i = 0; i < currLevel; i++) {

//         Node curr = q.remove();

//         // process curr

//         if(curr.left != null)
//             q.add(curr.left);

//         if(curr.right != null)
//             q.add(curr.right);
//     }
// }