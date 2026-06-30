//Traversing the stack 

//use st.pop() in a loop to traverse and get elenents, and also store all deleted ones into another stack, otherwise we will lose elements ,,,, Note: in another stack, elements will be reversed
//in another loop, add elements from another stack back to the original stack stack 

// T.C=O(n),, A.S=O(n)
import java.util.Stack;
public class stacksTraverse {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);   st.push(40);  st.push(-2);  st.push(30);  st.push(80);

        Stack<Integer> st2=new Stack<>();
        while(st.size()>0){
          int top=st.pop();
          System.out.println(top);
          st2.push(top);
        }

        while(st2.size()>0){
          st.push(st2.pop());
        }

        System.out.println();
        //peek, add & remove at any position 
        //using stack size method 

        //assuming indexes for elements (0th based)
        //get(3)
        int idx=3;
        while(st.size()>idx+1){
            st2.push(st.pop());     //st2.push to save deleted elements
        }
        System.out.println(st.peek());

        while(st2.size()>0){
          st.push(st2.pop()); 
        }
        System.out.println(st);
    }

}


//Reverse the stack 
//1. using arraylist
//2. using 3 stacks overalls (2 stack in addition to original) to get reverse of original stack in the place only. 
