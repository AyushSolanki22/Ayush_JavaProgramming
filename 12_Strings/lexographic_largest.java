//lexographic - like as alphates occuring at same index are smaller/bigger ,,lexographic order example: alphabet-wise roll no. in classes or like in dictionary 
public class lexographic_largest {
    //Java has a compareTo function to compare string based on lexographic comparision.  
    
    //compareTo functiong gives difference of indexes(when  lexographically comparing)
    public static void main(String[] args) {
        String fruits[]={"apple","mango","banana"};

        String largest=fruits[0];                //assumed it to be lexographically largest;
        for(int i=1; i<fruits.length; ++i) {
            if (largest.compareTo(fruits[i])<0) {   //finding lexographically larger element if there, than the assumed largest.
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