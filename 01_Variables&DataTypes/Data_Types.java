//Java is a typed language- we have to specify datatype
public class Data_Types {
    public static void main(String[] args) {
        byte b=8;   //1 byte(8 bits) ~(-128 to 127), default = 0
        short n=240; //2 bytes(16 bits) ~(-32,768 to 32,767)
        char ch='c'; //2 bytes (0 to 65,535 (unsigned)) '\u0000' to '\uffff'(unicode) 
        boolean bool=true; //typically 1 byte(JVM dependent)  default: false
        int number =100;  //4 bytes(32 bits) (-2,147,483,648 to 2,147,483,647)
        float price=10.5f; //4 bytes (±3.4E-38 to ±3.4E+38) default: 0.0f
        System.out.println("\u0063");

        double pi = 3.141592653589793; //8 bytes (±1.7E-308 to ±1.7E+308) (high precision)
        long bigNumber = 10000000000l; //8 bytes (Larger integer values) L or l 
        System.out.println(pi);


    }
}
//Non-Primitive Data Types: (jinhe hume create krna padta hai khud se)

//String
//Array
//Class
//Object
//Interface