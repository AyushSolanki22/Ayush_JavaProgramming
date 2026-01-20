// String is a data type to store texts - like sentences, paragraphs. It has many functions, features associated with it.
//String also has inbuilt class named String
import java.util.*;
public class strings {
    public static void printLetters(String f) {
        int i=0;
        while (i<f.length()) {
            System.out.print(f.charAt(i));
            ++i;
        }
    }
    public static void main(String[] args) {
        //strings are immutable;
        char arr[]={'a','b','c','d'};
        String str="abcd";
        String str2=new String("xyz");  //difference is in implentation level.

        //input output
        Scanner sc=new Scanner(System.in);
        String name=sc.next();   //or sc.nextLine() to input more than a word.
        System.out.println(name);
        
        //string length
        String fullname="tony stark";
        System.out.println(fullname.length()); //in array,length is a property(no ()) whereas in string, it is a function. 

        //concatenation
        String firstname="Ayush";
        String lastname="Solanki";
        String full_name=firstname+" "+lastname;
        System.out.println(full_name);

        //charAt method
        fullname="mrs. RS";
        printLetters(fullname);
        System.out.println("\n"+full_name.charAt(0));

        //when string is declared with new String, it creates a new memory of "Tony".
        String s1="Tony";
        String s2="Tony"; //String s1 & s2 are equal.- interning concept -- they are reference variables
        String s3=new String("Tony"); //string s1& s3 are not equal despite containing same word because of different memory locations. as s1==s2 compares the memory location,,, new keyword creates a new memory location containing value irrespective of whether it existed before or not
        //so it's better to compare equality of strings (on values) with different function.
        if (s1.equals(s3)) {    //this function compares on values
            System.out.println("\nStrings are equal.");
        }
    }
}
//Strings are immutable- their value cannot be changed at it's own original memory location itself, it takes new memory lcoation when value is changed like concatenated
//so whenever we have to make changes continously to a string, in a loop, it is a worst case- bad time complexity(0(n*m)), and slow loop in result. --- so we use a new structure, StringBuilder , similar to strings

//String buillder is like it can be created easily and continously modified, without unnecessary copying and new creations
//StringBuilder sb=new StringBuilder("HW");
//It almost have all features and functions similar to strings : append
//sb.toString()  --> converts it to string (if required),,condition: it need to be object[int a is not object, Integer a is ; char a is not object, Character is ]
 