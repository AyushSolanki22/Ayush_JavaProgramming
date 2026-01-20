//lexographic - like as alphates occuring first are smaller ,,lexographic order example: roll no. in classes
public class lexographic_largest {
    //Java has a compareTo function to compare string based on lexographic comparision.
    public static void main(String[] args) {
        String fruits[]={"apple","mango","banana"};

        String largest=fruits[0];
        for(int i=1; i<fruits.length; ++i) {
            if (largest.compareTo(fruits[i])<0) {
                 largest=fruits[i];
            }
        }
        System.out.println(largest);
    }
} 
//compareTO
//0: equal
//>0: +ve , st1>st2
//<0: -ve, st1<st2
//*****remember it is case insensitive