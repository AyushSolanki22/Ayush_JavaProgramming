// switch (variable) {
    // case '': 
    // case2 '':
    // case3 '':
    // default :
// }
public class switch_operator{
    public static void main(String[] args) {
        int number =2;
        switch (number) {                      //switch(variable){}
            case 1 : System.out.println("1");
               break;
            case 2 : System.out.println("2");
               break;
            case 3 : System.out.println("3");
               break;    //Agar switch mai koi bhi case true hoo jata toa baad ke saare true hote irrespective of, so we use break statement to come out of switch.
            default : System.out.println("default");  

        }

        
        char ch ='a';
        switch (ch) {
            case 'c' : System.out.println("c");
               break;
            case 'a': System.out.println("a");
               break;
            case 'b': System.out.println("b");
               break;    //Agar switch mai koi bhi case true hoo jata toa baad ke saare true hote irrespective of, so we use break statement to come out of switch.
            default : System.out.println("default");  

        }
    }
}