

public class uppercase_question {
    public static String toUpperCase(String str) {
        StringBuilder s=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0)); //it is a function.
        s.append(ch);

        for(int i=1; i<str.length(); ++i) {
             if (str.charAt(i)==' ' && i<str.length()-1) { //i<n-1 is for ignoring space in last of the word
                s.append(str.charAt(i));
                i++;
                if (str.charAt(i)!=' ') {
                    s.append(Character.toUpperCase(str.charAt(i)));     
                }
                else {
                    continue;
                }

             }
             else {
                s.append(str.charAt(i));
             }
        }
        return s.toString();

    }
    public static void main(String[] args) {
        String str="hi, i am aYush";

        System.out.println(toUpperCase(str));
    }
}
