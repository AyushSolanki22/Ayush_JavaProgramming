//FILO/LIFO concept ,,, 1. unlimited size  2. discpline ,,, stacks is a super data structure

//Stack operations -- peek, insert, remove ((all possible only on last element/top element of stack))    --- can't access any other element.. i.e. operations can be performed on only last/top element


// Stack<Integer> st=new Stack<>();
//Stack Operations  --- 
  // st.push();   --- add element to top  
  // st.peek()  ---- returns top element
  // st.pop() --- remove top element

  //Each have T.C= O(1)

  // we can print whole stack tho directly, similar to arraylist

import java.util.Stack;

public class stacks{
  public static void main(String[] args) {
      Stack <String> st=new Stack<>();

      System.out.println(st.isEmpty());   //a built-in function //will return true here
      // st.pop();  //error -- EmptyStackException -- underflow condition 
      st.push("Khushi");
      st.push("preet");
      st.push("ayush");
      System.out.println(st.size());
      System.out.print(st);   //built-in function   //A.S=O(n)
      st.pop();
      System.out.println(st+" "+st.size());
      System.out.println(st.peek());
      System.out.println(st.pop()); //it deletes last element along with returning deleted element too
  }
}

//underflow condition -- error when empty stack,,,, //overflow condition --error in a condition when no more elements are possible