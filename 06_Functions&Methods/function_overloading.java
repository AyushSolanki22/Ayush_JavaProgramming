// A good example of functions overloading

public class function_overloading {
    public static void main(String[] args) {
        multiply(5.4f,9.3f);         
        //that function would be called aligning with the given value data type in function call.
        // Function overloading -- Functions with same name but different parameters**.
    }
    public static void multiply(int a, int b) {
        int prod=a*b;
        System.out.println("Calculated Product1: "+prod);

    }
        public static void multiply(int a, int b, int c) {
        int prod=a*b*c;
        System.out.println("Calculated Product2: "+prod);

    }
        public static void multiply(float a, float b) {
        float prod=a*b;
        System.out.println("Calculated Product3: "+prod);

    }


}