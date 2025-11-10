//conversion from bigger DataType to smaller type causes error.--lossy conversion.

public class type_promotion {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        System.out.println((int)a); //explicit TypeCasting
        System.out.println((int)b);
        System.out.println(a);
        System.out.println(a-b);  //In expressions, char, byte and short are converted tp int -- type promotion
        // char c = a-b;   --> it will cause error as int is not converted to short -- lossy conversion
        char c = (char)(a-b); //explicit typecasting--to remove error of warning (of lossy conversion)
        System.out.println(c);

        //If one operator is long,double or float, the whole expression is promoted to long, double or float respectively. -- converted to the largest datatype used in expression.
        int i =10;
        float fl=25.25f;
        long l = 25;
        double d = 30;
        // int ans = a+b+c+d //the expression results in a double value ,, so it would be a lossy conversion - error.
        double ans = i+fl+l+d;
        System.out.println(ans);


        //Important concept below]]
        byte by =2;
        //by=by*2;   //--> This woulg give error as it's lossy conversion from int to byte ,,#type promotion in expression makes b int.
        //logically here there would have been no error but it's lossy conversion which lead to error in java
        //Why? Even though, by is of byte,2 is an int literal. 
        //In java, arithmetic operations like *, +, -, / automatically promote smaller types (byte, short, char) to int. 
        //And you're trying to assign this int result to a byte variable: Hence "lossy conversion from int to byte"
        by=(byte)(by*2);         //explicit typecasting
        System.out.println(by);
    }
}