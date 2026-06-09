// Creating, accessing nodes of LinkedList
public class linkedList{
    public static void main(String[] args) {
        //10 20 30 40 50 
        Node a=new Node(10); 
        Node b=new Node(20); 
        Node c=new Node(30); 
        Node d=new Node(40); 
        Node e=new Node(50); 

        //connection (linking) of elements
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        System.out.println(get(a,4));


        Node n=null;
        // System.out.println(n.val); //will lead to NullPointerException as null value is nothing, so traversing should be stopped before null (as it marks end of linkedList)
    }
    static int get(Node head,int idx){
        Node temp=head;
        for(int i=1; i<=idx;++i){
            temp=temp.next;
        }
        return temp.val;
    }
}

class Node{   //user defined dataType
    int val;
    Node next;  //default-null
    //next --> consists of whole info of the next element (is reference to next element)
    //null --> depicts end of LinkedList
    Node(int val){
        this.val=val;
    }
}
