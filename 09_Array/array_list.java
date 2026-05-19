import java.util.ArrayList;  //this is necessary to import ArrayList Type to use ArrayList
import java.util.Collections; //this is necessary to import Collections to use features like reverse
public class array_list {
    public static void main(String[] args) {
                ArrayList <Integer> arr=new ArrayList<>();   //Declaration 
                arr.add(2);  // or arr.add(index, element)   //to add element
                System.out.println(arr);       //Whole array can be prited at once
                System.out.println(arr.get(0));
                arr.set(0,3);
                arr.add(4);
                System.out.println(arr);
                
                System.out.println(arr.size());  //size+()
                
                Collections.reverse(arr); //reverses array

                System.out.println(arr);
                arr.clear(); //clears array --> []

                ArrayList <Integer> arr2= (ArrayList<Integer>) arr.clone();  //clones array arr into arr2
                // clone() returns object so it is typecasted using (ArrayList<Integer>)
                //As Java cannot guarantee returned object is ArrayList that's why it gives warning : unchecked cast warning
                
                System.out.println(arr2);

                //More better way to clone
                ArrayList<Integer> arr3 = new ArrayList<>(arr);
                System.out.println(arr3);

                
    }
}
