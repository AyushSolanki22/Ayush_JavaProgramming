public class string_compression {
    public static void compress(String s) {
        String newStr="";
        for(int i=0; i<s.length(); ++i) {               //0(n)
            Integer count=1;  //to concatenate, integer
            newStr+=s.charAt(i);
            while (i<s.length()-1 && s.charAt(i)==s.charAt(i+1)) {  //n-1 to not go out of index;
                ++count;
                ++i;
            }
            // newStr+=s.charAt(i); //can also be written here.
            if(count>1) {
                newStr+=count.toString();
            }
        }    
        System.out.println(newStr);
    }
    public static void main(String[] args) {
        String s="aaaabbbbcd";

        compress(s);
    }
}