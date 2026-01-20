//continous sub-part of a string (like subarrays)--> substring  
//Inbuilt Substring , User defined substring
public class substring {
    public static String subString(String str, int si, int ei) {
        String substr="";
        for(int i=si; i<ei; ++i) {
            substr+=str.charAt(i); //concatenation

        }
        return substr;
    }
    public static void main(String[] args) {
        //Substring -- like subArray.......(subsequence).
        //si , ei(exclusive)
        String s="Hello World";

        System.out.println(subString(s, 0,7));

        //in-built Substring java 
        System.out.println(s.substring(0,9));
    }
}
