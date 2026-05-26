//Substring is a continous sub-part of a array
//Whereas, subsequence is a sub-part of array , which may ignore characters in between within a string
//Like in "abcde",, ace is one such subsequence ((Basically like a subset))


//"abc" ={"a","b","c","ab","ac","bc","abc"}    //Subequences //(2*n)-1 of length of string    



//Subsequence or Power Set

//Way to get/print subsequences
//Core concept - pick or skip recursion //See image  //((subsets+p&c concept too))
//((add kru ya nahi krru recursion)) --> and we get all subsequences 


public class subsequences{
    public static void main(String[] args) {
        String s="abc";
        subsets("",s,0);
    }

    static void subsets(String ans, String s, int idx){
        if(idx==s.length()){
            System.out.println(ans+" ");
            return;
        }
        char ch=s.charAt(idx);
        subsets(ans+ch, s, idx+1); //pick
        subsets(ans, s, idx+1); //skip
    }
}