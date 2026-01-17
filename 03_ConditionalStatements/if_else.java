// if (condition) {  
//  
// }
// else if (condition) {
// }
// else {
// 
// }
public class if_else {
    public static void main(String[] args) {
        int age =100;
        if (age>=18) {
            System.out.println("You are above 18, You can drive, vote.");
        }
        else if (age>13 && age<18) {           
            System.out.println("Teenager");    //Listen, curly braces are not allowed incase if there is a single statement.
             
        }
        else {
            System.out.println("child");
        }
    }
}