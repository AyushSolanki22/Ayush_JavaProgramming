// Traversing whole LinkedList with node head only

public class traverse {
    //Questions always comes in with node head only ,and using that we have to traverse whole LinkedList
    //Below are 2 ways: 1. traversing whole linkedList using temp 2. traversing through recursion
    static void display(Node head) {
        Node temp=head;   //a reference for traversing
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next; //temp++
        }
        System.out.println();
        // for(Node temp=head;temp!=null;temp=temp.next){
        //     System.out.println(temp.val);
        // }
    }
    static void displayRec(Node head){
        if(head==null)return;
        System.out.print(head.val+" ");
        displayRec(head.next);

    }
    public static void main(String[] args) {
        //10 20 30 40 50 
        Node a=new Node(10); 
        Node b=new Node(20); 
        Node c=new Node(30); 
        Node d=new Node(40); 
        Node e=new Node(50); 

        //connection (linking) of elements
        a.next=b;   //a.next=b is making a's next storing reference to b
        b.next=c;
        c.next=d;
        d.next=e;
        // display(a);
        displayRec(a);
        System.out.println();
    }    
}

class Node{   //user defined dataType
    int val;
    Node next;  //default-null
    Node(int val){
        this.val=val;
    }
}