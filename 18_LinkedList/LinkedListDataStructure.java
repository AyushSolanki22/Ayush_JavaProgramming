// Linked List Class --> head , tail

// addAtTail, addAtHead -- two cases: 0 size, normal case (>1 size)
// create a temp node, 0 size condition+normal case

// removeAtTail, removeAtHead -- three cases : 0 size, 1 size, normal case(>1 size)

//insert(idx,value)
//create t, traverse through to idx-1, temp=idx-1 node, 
//Simple, we will to avoid break of the connection with elements from idx 
//we will firstly, t.next=temp.next; then, temp.next=t
//node inserted, no disturbance in linkedList  
//base cases --> if idx>size OR idx<0-- error,, --> if idx=size-- addAtTail

public class LinkedListDataStructure {
    public static void main(String[] args) {
        LinkedList li=new LinkedList();
        li.addAtTail(10);
        li.addAtTail(20);
        li.addAtTail(30);
        li.addAtTail(40);
        li.display();
        li.addAtHead(50);
        li.display();
        li.deleteAtHead();
        li.display();
        System.out.println(li.size);
        System.out.println(li.search(30));
        li.insert(4,40);
        li.display();

    }
}

class Node{   //user defined dataType
    int val;
    Node next;  //default-null
    Node(int val){
        this.val=val;
    }
}

class LinkedList{ //user defined data structure -- properties(variables)+methods
    Node head;  //default -- null
    Node tail;  //default -- null
    int size;
    void addAtTail(int val){   //insertAtTail
        Node temp=new Node(val);
        if(tail==null) head=tail=temp; //0 size condition
        else{
            tail.next=temp;
            tail=temp;
        }
        size++;
    }
    void addAtHead(int val){   //insertAtHead
        Node temp=new Node(val);
        if(head==null) head=tail=temp;
        else{
            temp.next=head;
            head=temp;
        }
        size++;
    }

    void display(){
        if(head==null) return;
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    
    void deleteAtHead(){
        if(head==null){
            System.out.println("List is empty!");
            return;
        } 
        head=head.next;  //the previous head will still be linked to the current head but it doesn't matter as if any new node at as head, the link will break with the previous head

        //1 size case
        if(head==null) tail=null;
        size--;
    }

    int search(int val){
        if(head==null) return -1;
        Node temp=head;
        int idx=0;
        while(temp!=null){
            if(temp.val==val) return idx;
            temp=temp.next;
            ++idx;
        }
        return -1;
    }
    void insert(int idx,int val){
        if(idx>size||idx<0) System.out.println("Inavlid index");
        else if(idx==0) addAtHead(val);
        else if(idx==size) addAtTail(val);
        
        else{
        int i=0;
        Node t=new Node(val);
        Node temp=head;
        while(temp!=null){
            if(i==idx-1){
                break;
            }
            temp=temp.next;
            i++;
        }
        t.next=temp.next;
        temp.next=t;
        size++;
    }
   
    }
}