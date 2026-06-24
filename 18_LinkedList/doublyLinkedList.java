public class doublyLinkedList {
    public static void main(String[] args) {
        DLL list=new DLL();
        list.addAtHead(20);
        list.addAtHead(20);
        list.addAtHead(20);
        list.addAtHead(20);
        System.out.println(list.size);
        list.display();
        list.insert(2, 25);
        list.display();
        list.delete(2); list.display();
        // list.deleteAtHead();
        // list.addAtTail(30);
        // list.display();
    }
}
class Node{
    int val; 
    Node next;
    Node prev;   //special thing in doubly linkedList --
    // with the help of prev, we can traverse through in both directions, helpful in palindrome, reverse, reverse order printing
    Node(int val){
        this.val=val;
    }
}
//disadvantage -- taking more space as there is one extra thing in individual node 



class DLL{      //doubly Linked List class
    Node head;
    Node tail;
    int size;
    void addAtHead(int val){
        Node temp=new Node(val);
        if(head==null){
            head=temp;
            tail=temp;
            size++;
            return;
        }
        temp.next=head;
        head.prev=temp;
        head=temp;
        size++;
        // head.prev=null;   not required somewhat as temp=new node automatically creates temp.next=temp.prev=null;
    }
    void addAtTail(int val){
        Node temp=new Node(val);
        if(tail==null){
            head=temp;
            tail=temp;
        }
        else{
            tail.next=temp;
            temp.prev=tail;
            tail=temp;
        }
        size++;
    }
    void deleteAtHead(){
        if(head==null) System.out.println("No node present already");
        else if(size==1){
            head=tail=null;
            size--;
        }
        else{
            head=head.next;
            head.prev=null;
            size--;
        }
        
    }
    
    void deleteAtTail(){
        if(tail==null) System.out.println("No node present already");
        else if(size==1){
            head=tail=null;
            size--;
        }
        else{
            tail=tail.prev;
            tail.next=null;
            size--;
        }
    }
    void insert(int idx,int val){
        if(idx<0 || idx>size) System.out.println("Invalid index");
        else if(idx==0) addAtHead(val);
        else if(idx==size) addAtTail(val);
        else{
            Node temp=new Node(val);
            Node prev=head;
            for(int i=1;i<=idx-1;++i){
                prev=prev.next;
            }
            Node next=prev.next;
            prev.next=temp;
            temp.prev=prev;
            temp.next=next;
            next.prev=temp;
            size++;
        }
    }
    void delete(int idx){
        if(idx==0) deleteAtHead();
        else if(idx==size-1) deleteAtTail();
        else{
            Node prev=head;
            for(int i=1;i<=idx-1;++i){
                prev=prev.next;
            }
            Node next=prev.next.next;
            prev.next=next;
            next.prev=prev;
            size--;
        }
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    void displayReverse(){
        Node temp=tail;
        while(temp!=null){
            temp=temp.prev;
            System.out.print(temp.val+" ");
            
            System.out.println();
        }
    }

}