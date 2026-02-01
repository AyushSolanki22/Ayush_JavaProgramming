//In Java, access modifiers (also known as access specifiers) are keywords that set the control of accessibility (visibility) of classes, interfaces, constructors, methods, and variables.  
//It protect sensitive information and manage control of the data(information) where to be used/accessed or not, whether to be protected, private, and public.
//They are a core part of the encapsulation principle in object-oriented programming, helping to control which parts of a program can access an specific element. 

//Access Modifiers: Default,Private,Public, Protected

//A package is group of similar type of classes,interfaces and sub-packages,,,,, different classes or packages have full/limited/no access to each other like google maps doesn't need information/data of google pay.,, packages are of 2 types: inbuilt and user-defined
public class access_modifiers {
    public static void main(String[] args) {
        BankAccount myAcc= new BankAccount();
        myAcc.username="ayushsolanki";
        // System.out.println(myAcc.password); //would cause error as no access
        myAcc.setPassword("ayush2208@@");
        System.out.println(myAcc.username);
    }
}



class BankAccount{
    //allow user to set password , but don't allow to access/check password. 
    public String username;
    
    private String password;
    public void setPassword(String pwd) {
        password=pwd;
    }
}
