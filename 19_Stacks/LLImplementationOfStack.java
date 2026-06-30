public class LLImplementationOfStack {
    public static void main(String[] args) {
        MyStack st=new MyStack();

        st.push(10); st.push(20); st.push(30); st.push(40);
        st.display();

        st.pop();
        st.display();
        
    }
}

class Node{
  int val;
  Node next;
  Node(int val){
    this.val=val;
  }
}


class MyStack {
    Node head;
    int len;   //not named with size, as we have also maken size function

    int peek(){
      if(head==null){
        System.out.println("Stack is empty!");
        return -1;
      }
      return head.val;
    }
     
    int pop(){  //deleteAtHead
      int x=head.val;
      if(head==null){
        System.out.println("Stack is empty!");
        return -1;
      }
      head=head.next;
      len--;
      return x;
    }

    void push(int ele){   //AddAtHead

      Node temp=new Node(ele);
      if(len==0) head=temp;
      else{
        temp.next=head;
        head=temp;
      }
      len++;
    }

    int size(){
      return len;
    }

    void display(){
      Node temp=head;
      while(temp!=null){
        System.out.print(temp.val+" ");
        temp=temp.next;
      }
      System.out.println();
    }


}


//Linkedlist display the stack from top-> bottom (head--> tail),,,, whereas Java's stack prints bottom --> top.

//No issue here. The answer depends on what you mean by "displaying a stack."
//Java's stack display is as because  Java's Stack inherits from Vector. Vector prints its elements from index 0 to size-1.
// The last element happens to be the top.  So Java isn't printing it as a "stack." It is printing it as a Vector/List.


  q
//throwsException keyword