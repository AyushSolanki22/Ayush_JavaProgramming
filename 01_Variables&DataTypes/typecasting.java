
import java.util.Scanner;

public class typecasting {
    public static void main(String[] args) {
        //type conversion is generally possible in same type of data and from smaller to larger type, implicit typecasting -- WIDENING CONVERSION
        //but not from larger to smaller type without explicit casting -- NARROWING CONVERSION
        float a = 5.5f;
        int b = (int)a; //can be done through Explicit type casting from float to int as it's narrowing conversion 
        System.out.println("Value of b after casting: " + b);

        char c = 'a';
        int d = c; // Implicit type casting from char to int
        System.out.println("Value of d after implicit casting: " + d);
        

    }
}